Imports MySql.Data.MySqlClient
Public Class Student_Update
    Dim conn As New MySqlConnection("datasource=localhost;port=3306;username=root;password=;database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter
    Dim ds As New DataSet

    Sub SetDataGrid()
        Try
            DataGridStudent.Columns(0).Width = 50
            DataGridStudent.Columns(1).Width = 130
            DataGridStudent.Columns(2).Width = 100
            DataGridStudent.Columns(3).Width = 250

            DataGridStudent.Columns(0).HeaderText = "ID"
            DataGridStudent.Columns(1).HeaderText = "Name"
            DataGridStudent.Columns(2).HeaderText = "Class"
            DataGridStudent.Columns(3).HeaderText = "Contact"
        Catch ex As Exception
        End Try
    End Sub
    Sub showStudent()
        conn.Open()
        da = New MySqlDataAdapter("select * from student", conn)
        ds = New DataSet
        da.Fill(ds, "student")
        DataGridStudent.DataSource = ds.Tables("student")
    End Sub

    Private Sub Student_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call showStudent()
        Call SetDataGrid()
        Call comboboxClass()
        Label7.Text = ConnectionDB.session
    End Sub
    Sub comboboxClass()
        Dim str As String
        str = "select Student_Class from class"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cbClass.Items.Add(rd("Student_Class"))
            Loop
        Else
        End If
        conn.Close()
    End Sub
    Private Sub DataGridStudent_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles DataGridStudent.CellMouseClick
        If DataGridStudent().RowCount > 0 Then
            Dim baris As Integer
            With DataGridStudent
                baris = .CurrentRow.Index
                txtID.Text = .Item(0, baris).Value.ToString
                txtName.Text = .Item(1, baris).Value
                cbClass.Text = .Item(2, baris).Value
                txtContact.Text = .Item(3, baris).Value

                txtName.Enabled = True
                cbClass.Enabled = True
                txtContact.Enabled = True
                txtName.Focus()

            End With
        End If
    End Sub

    Sub deleteStudent()
        conn.Open()
        Try
            Call koneksi()
            Dim str As String
            str = "delete from student where Student_ID = '" & txtID.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Student Success")
        Catch ex As Exception
            MsgBox("Student gagal disimpan" + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub
    Sub updateStudent()
        conn.Open()
        Try
            Call koneksi()
            Dim str As String
            str = "Update student set Student_Name = '" & txtName.Text & "', Student_Class = '" & cbClass.Text & "', Student_Contact = '" & txtContact.Text & "', Author = '" & Label7.Text & "' where Student_ID = '" & txtID.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Student Success")
        Catch ex As Exception
            MsgBox("Student gagal disimpan" + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub
    Sub refreshTable()
        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT * FROM student", conn)
        da.Fill(Table)
        DataGridStudent.DataSource = Table
    End Sub

    Sub searchdata()
        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT Student_ID, Student_Name, Student_Class, Student_Contact FROM student WHERE Student_ID like '%" & txtSearch.Text & "%' or Student_Name like '%" & txtSearch.Text & "%' or  Student_Class like '%" & txtSearch.Text & "%'or Student_Contact like '%" & txtSearch.Text & "%'", conn)
        da.Fill(Table)
        DataGridStudent.DataSource = Table
    End Sub

    Private Sub btnDelete_Click(sender As Object, e As EventArgs) Handles btnDelete.Click
        Call deleteStudent()
        refreshTable()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        updateStudent()
        refreshTable()
    End Sub
    Private Sub btnBack_Click(sender As Object, e As EventArgs) Handles btnBack.Click
        Me.Hide()
        Main_Menu.Show()
    End Sub

    Private Sub txtSearch_TextChanged(sender As Object, e As EventArgs) Handles txtSearch.TextChanged
        Call searchdata()
    End Sub
End Class