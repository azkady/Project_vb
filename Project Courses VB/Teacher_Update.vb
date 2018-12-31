Imports MySql.Data.MySqlClient
Imports System.Data.Odbc
Public Class Teacher_Update
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter

    Dim ds As New DataSet

    Sub SetDataGrid()
        Try
            DataGridView1.Columns(0).Width = 50
            DataGridView1.Columns(1).Width = 130
            DataGridView1.Columns(2).Width = 100
            DataGridView1.Columns(3).Width = 250
            DataGridView1.Columns(4).Width = 130

            DataGridView1.Columns(0).HeaderText = "ID"
            DataGridView1.Columns(1).HeaderText = "Name"
            DataGridView1.Columns(2).HeaderText = "Lesson Skill"
            DataGridView1.Columns(3).HeaderText = "Contact"
            DataGridView1.Columns(4).HeaderText = "Author"

        Catch ex As Exception
        End Try
    End Sub

    Sub showTeacher()
        conn.Open()
        da = New MySqlDataAdapter("select Teacher_ID, Teacher_Name, Teacher_Lesson, Teacher_Contact, Author from teacher", conn)
        ds = New DataSet
        da.Fill(ds, "teacher")
        DataGridView1.DataSource = ds.Tables("teacher")
    End Sub

    Private Sub Teacher_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call showTeacher()
        Call SetDataGrid()
    End Sub

    Private Sub DataGridView1_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridView1.CellContentClick

    End Sub

    Private Sub DataGridView1_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles DataGridView1.CellMouseClick
        If DataGridView1().RowCount > 0 Then
            Dim baris As Integer
            With DataGridView1
                baris = .CurrentRow.Index


                TextBox4.Text = .Item(0, baris).Value.ToString
                TextBox1.Text = .Item(1, baris).Value
                TextBox2.Text = .Item(2, baris).Value
                TextBox3.Text = .Item(2, baris).Value

                TextBox1.Enabled = True
                TextBox2.Enabled = True
                TextBox3.Enabled = True

                TextBox1.Focus()

            End With
        End If
    End Sub

    Sub deleteTeacher()
        Try
            Call koneksi()
            Dim str As String
            str = "Delete from teacher where Teacher_ID = '" & TextBox4.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Room Success")
        Catch ex As Exception
            MessageBox.Show("Delete Room Failed")
        End Try
    End Sub
    Sub updateTeacher()
        Dim author As String
        Try
            Call koneksi()
            Dim str As String
            str = "Update teacher set Teacher_Name = '" & TextBox1.Text & "', Teacher_Lesson = '" & TextBox2.Text & "', Teacher_Contact = '" & TextBox3.Text & "' where Teacher_ID = '" & TextBox4.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Teacher Success")
        Catch ex As Exception
            MessageBox.Show("Update Teacher Failed")
        End Try
    End Sub
    Sub refreshTable()
        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT * FROM teacher", conn)
        da.Fill(Table)
        DataGridView1.DataSource = Table
    End Sub

    Sub searchdata()

        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT Teacher_ID, Teacher_Name, Teacher_Lesson, Teacher_Contact, Author FROM teacher WHERE Teacher_ID like '%" & TextBox5.Text & "%' or Teacher_Name like '%" & TextBox5.Text & "%' or  Teacher_Lesson like '%" & TextBox5.Text & "%'or Teacher_Contact like '%" & TextBox5.Text & "%' or Author like '%" & TextBox5.Text & "%' ", conn)
        da.Fill(Table)
        DataGridView1.DataSource = Table
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Call deleteTeacher()
        refreshTable()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        updateTeacher()
        refreshTable()
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        TextBox5.Enabled = True
        searchdata()
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Me.Hide()
        Main_Menu.Show()
    End Sub
End Class