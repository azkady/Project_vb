Imports MySql.Data.MySqlClient
Imports Project_Courses_VB.koneksi
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
        If DataGridStudent().RowCount > 0 Then
            Dim baris As Integer
            With DataGridStudent
                baris = .CurrentRow.Index
                txtID.Text = .Item(0, baris).Value
                txtName.Text = .Item(1, baris).Value
                txtClass.Text = .Item(2, baris).Value
                txtContact.Text = .Item(3, baris).Value

                txtID.Enabled = True
                txtID.Focus()
            End With
        End If
    End Sub

    Private Sub TextBox3_TextChanged(sender As Object, e As EventArgs) Handles txtContact.TextChanged

    End Sub
End Class