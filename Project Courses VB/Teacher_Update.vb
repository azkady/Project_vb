Imports MySql.Data.MySqlClient
Imports ProjectCoursesVB.ConnectionDB
Public Class Teacher_Update

    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter

    Dim ds As New DataSet

    Sub SetDataGrid()
        Try
            DataGridTeacher.Columns(0).Width = 50
            DataGridTeacher.Columns(1).Width = 130
            DataGridTeacher.Columns(2).Width = 100
            DataGridTeacher.Columns(3).Width = 250

            DataGridTeacher.Columns(0).HeaderText = "ID"
            DataGridTeacher.Columns(1).HeaderText = "Name"
            DataGridTeacher.Columns(2).HeaderText = "Lesson Skill"
            DataGridTeacher.Columns(3).HeaderText = "Contact"
        Catch ex As Exception
        End Try
    End Sub

    Sub showTeacher()
        conn.Open()
        da = New MySqlDataAdapter("select Teacher_ID, Teacher_Name, Teacher_Lesson, Teacher_Contact from teacher", conn)
        ds = New DataSet
        da.Fill(ds, "teacher")
        DataGridTeacher.DataSource = ds.Tables("teacher")
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Me.Hide()
        Main_Menu.Show()
    End Sub

    Private Sub Teacher_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call showTeacher()
        Call SetDataGrid()
    End Sub


    Sub deleteTeacher()
        Try
            Call koneksi()
            Dim str As String
            str = "delete from teacher where Teacher_ID = '" & txtID.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Teacher Success")
        Catch ex As Exception
            MessageBox.Show("Delete Teacher Failed")
        End Try
    End Sub

    Sub updateTeacher()
        Dim author As String
        Try
            Call koneksi()
            Dim str As String
            str = "Update teacher set Teacher_Name = '" & txtName.Text & "', Teacher_Lesson = '" & txtLesson.Text & "', Teacher_Contact = '" & txtContact.Text & "' where Teacher_ID = '" & txtID.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Teacher Success")
        Catch ex As Exception
            MessageBox.Show("Update Teacher Failed")
        End Try
    End Sub

    Sub searchdata()

        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT Teacher_ID, Teacher_Name, Teacher_Lesson, Teacher_Contact FROM teacher WHERE Teacher_ID like '%" & TextBox5.Text & "%' or Teacher_Name like '%" & TextBox5.Text & "%' or  Teacher_Lesson like '%" & TextBox5.Text & "%'or Teacher_Contact like '%" & TextBox5.Text & "%'", conn)
        da.Fill(Table)
        DataGridTeacher.DataSource = Table
    End Sub

    Sub refreshTable()
        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT * FROM teacher", conn)
        da.Fill(Table)
        DataGridTeacher.DataSource = Table
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        updateTeacher()
        refreshTable()
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Call deleteTeacher()
        refreshTable()
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        TextBox5.Enabled = True
        searchdata()
    End Sub

    Private Sub DataGridTeacher_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridTeacher.CellContentClick

    End Sub

    Private Sub DataGridTeacher_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles DataGridTeacher.CellMouseClick
        If DataGridTeacher().RowCount > 0 Then
            Dim baris As Integer
            With DataGridTeacher
                baris = .CurrentRow.Index
                txtID.Text = .Item(0, baris).Value.ToString
                txtName.Text = .Item(1, baris).Value
                txtLesson.Text = .Item(2, baris).Value
                txtContact.Text = .Item(3, baris).Value

                txtName.Enabled = True
                txtLesson.Enabled = True
                txtContact.Enabled = True
                txtName.Focus()

            End With
        End If
    End Sub
End Class