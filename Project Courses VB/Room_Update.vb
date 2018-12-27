Imports MySql.Data.MySqlClient
Imports System.Data.Odbc
Public Class Room_Update
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter

    Dim ds As New DataSet

    Sub SetDataGrid()
        Try
            tableRoom.Columns(0).Width = 50
            tableRoom.Columns(1).Width = 130
            tableRoom.Columns(2).Width = 100
            tableRoom.Columns(3).Width = 250

            tableRoom.Columns(0).HeaderText = "ID"
            tableRoom.Columns(1).HeaderText = "Student Class"
            tableRoom.Columns(2).HeaderText = "Room Name"
            tableRoom.Columns(3).HeaderText = "Author"
        Catch ex As Exception
        End Try
    End Sub

    Sub showRoom()
        conn.Open()
        da = New MySqlDataAdapter("select ID_Class, Student_Class, Class_Name from class", conn)
        ds = New DataSet
        da.Fill(ds, "class")
        tableRoom.DataSource = ds.Tables("class")
    End Sub

    Private Sub Class_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call showRoom()
        Call SetDataGrid()
    End Sub

    Private Sub tableRoom_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles tableRoom.CellContentClick

    End Sub

    Private Sub tableRoom_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles tableRoom.CellMouseClick
        If tableRoom().RowCount > 0 Then
            Dim baris As Integer
            With tableRoom
                baris = .CurrentRow.Index
                txtIdclass.Text = .Item(0, baris).Value.ToString
                txtStudentclass.Text = .Item(1, baris).Value
                txtRoomname.Text = .Item(2, baris).Value

                txtStudentclass.Enabled = True
                txtRoomname.Enabled = True

                txtStudentclass.Focus()

            End With
        End If
    End Sub

    Sub deleteClass()
        Try
            Call koneksi()
            Dim str As String
            str = "Delete from class where ID_Class = '" & txtIdclass.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Room Success")
        Catch ex As Exception
            MessageBox.Show("Delete Room Failed")
        End Try
    End Sub
    Sub updateClass()
        Dim author As String
        Try
            Call koneksi()
            Dim str As String
            str = "Update class set Student_Class = '" & txtStudentclass.Text & "', Class_Name = '" & txtRoomname.Text & "' where ID_Class = '" & txtIdclass.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Room Success")
        Catch ex As Exception
            MessageBox.Show("Update Room Failed")
        End Try
    End Sub
    Sub refreshTable()
        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT * FROM class", conn)
        da.Fill(Table)
        tableRoom.DataSource = Table
    End Sub

    Sub searchdata()

        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT ID_Class, Student_Class, Class_Name, Author FROM class WHERE ID_Class like '%" & txtSearch.Text & "%' or Student_Class like '%" & txtSearch.Text & "%' or  Class_Name like '%" & txtSearch.Text & "%'or Author like '%" & txtSearch.Text & "%'", conn)
        da.Fill(Table)
        tableRoom.DataSource = Table
    End Sub

    Private Sub tnDelete_Click(sender As Object, e As EventArgs) Handles tnDelete.Click
        Call deleteClass()
        refreshTable()
    End Sub

    Private Sub btnUpdate_Click(sender As Object, e As EventArgs) Handles btnUpdate.Click
        updateClass()
        refreshTable()
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        txtSearch.Enabled = True
        searchdata()
    End Sub

    Private Sub btnBack_Click(sender As Object, e As EventArgs) Handles btnBack.Click
        Me.Hide()
        Main_Menu.Show()
    End Sub
End Class