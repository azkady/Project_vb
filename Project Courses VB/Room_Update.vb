Imports MySql.Data.MySqlClient
Imports System.Data.Odbc
Public Class Room_Update
    Private Sub Room_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call refreshTable()
    End Sub

    Private Sub tableRoom_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles tableRoom.CellMouseClick
        txtIdclass.Text = tableRoom.Rows(e.RowIndex).Cells(0).Value
        txtStudentclass.Text = tableRoom.Rows(e.RowIndex).Cells(1).Value
        txtRoomname.Text = tableRoom.Rows(e.RowIndex).Cells(2).Value
    End Sub

    Private Sub btnUpdate_Click(sender As Object, e As EventArgs) Handles btnUpdate.Click
        Call updateRoom()
        Call refreshTable()
    End Sub
    Private Sub tnDelete_Click(sender As Object, e As EventArgs) Handles tnDelete.Click
        Call deleteRoom()
        Call refreshTable()
    End Sub

    Sub deleteRoom()
        Try
            Call koneksi()
            Dim str As String
            str = "delete from class where ID_Class = '" & txtIdclass.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Success")
        Catch ex As Exception
            MessageBox.Show("Delete Failed")
        End Try
    End Sub

    Sub updateRoom()
        Dim author As String
        Try
            Call koneksi()
            Dim str As String
            str = "Update class set Student_Class = '" & txtStudentclass.Text & "', Class_Name = '" & txtRoomname.Text & "', Author = '" & author & "' where ID_Class = '" & txtIdclass.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Class Success")
        Catch ex As Exception
            MessageBox.Show("Update Class Failed")
        End Try
    End Sub
    Sub refreshTable()
        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT * FROM class", conn)
        da.Fill(Table)
        tableRoom.DataSource = Table
    End Sub

    Private Sub btnBack_Click(sender As Object, e As EventArgs) Handles btnBack.Click
        Me.Hide()
        Main_Menu.Show()
    End Sub
End Class