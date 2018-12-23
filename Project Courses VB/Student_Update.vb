Imports MySql.Data.MySqlClient
Imports ProjectCoursesVB.ConnectionDB
Public Class Student_Update
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
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
        DA = New MySqlDataAdapter("select Student_ID, Student_Name, Student_Class, Student_Contact from student", conn)
        ds = New DataSet
        DA.Fill(ds, "student")
        DataGridStudent.DataSource = ds.Tables("student")
    End Sub

    Private Sub Student_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call showStudent()
        Call SetDataGrid()
    End Sub

    Private Sub DataGridStudent_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridStudent.CellContentClick

    End Sub
    Private Sub DataGridStudent_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles DataGridStudent.CellMouseClick
        If DataGridStudent().RowCount > 0 Then
            Dim baris As Integer
            With DataGridStudent
                baris = .CurrentRow.Index
                txtID.Text = .Item(0, baris).Value.ToString
                txtName.Text = .Item(1, baris).Value
                txtClass.Text = .Item(2, baris).Value
                txtContact.Text = .Item(3, baris).Value

                txtName.Enabled = True
                txtClass.Enabled = True
                txtContact.Enabled = True
                txtName.Focus()

            End With
        End If
    End Sub

    Private Sub TextBox3_TextChanged(sender As Object, e As EventArgs) Handles txtContact.TextChanged

    End Sub
    Sub deleteStudent()
        Try
            Call koneksi()
            Dim str As String
            str = "delete from student where Student_ID = '" & txtID.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Student Success")
        Catch ex As Exception
            MessageBox.Show("Delete Student Failed")
        End Try
    End Sub
    Sub updateStudent()
        Dim author As String
        Try
            Call koneksi()
            Dim str As String
            str = "Update student set Student_Name = '" & txtName.Text & "', Student_Class = '" & txtClass.Text & "', Student_Contact = '" & txtContact.Text & "' where Student_ID = '" & txtID.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Student Success")
        Catch ex As Exception
            MessageBox.Show("Update Student Failed")
        End Try
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
        da = New MySqlDataAdapter("SELECT Student_ID, Student_Name, Student_Class, Student_Contact FROM student WHERE Student_ID like '%" & TextBox5.Text & "%' or Student_Name like '%" & TextBox5.Text & "%' or  Student_Class like '%" & TextBox5.Text & "%'or Student_Contact like '%" & TextBox5.Text & "%'", conn)
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

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        TextBox5.Enabled = True
        searchdata()
    End Sub
End Class