Imports MySql.Data.MySqlClient
Imports System.Data.Odbc
Public Class Room_Update
    Dim conn As New MySqlConnection("datasource=localhost;port=3306;username=root;password=;database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter
    Dim ds As New DataSet
    Private Sub Room_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call refreshTable()
        Call comboboxClass()
        Label4.Text = ConnectionDB.session
    End Sub
    Sub comboboxClass()
        conn.Open()
        Dim str As String
        str = "select Student_Class from student"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cbClass1.Items.Add(rd("Student_Class"))
            Loop
        Else
        End If
        conn.Close()
    End Sub

    Private Sub tableRoom_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles tableRoom.CellMouseClick
        txtIdclass.Text = tableRoom.Rows(e.RowIndex).Cells(0).Value
        cbClass1.Text = tableRoom.Rows(e.RowIndex).Cells(1).Value
        txtRoomname.Text = tableRoom.Rows(e.RowIndex).Cells(2).Value
        txtSearch.Text = ("")
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
        conn.Open()
        Try
            Call koneksi()
            Dim str As String
            str = "delete from class where ID_Class = '" & txtIdclass.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Success")
        Catch ex As Exception
            MsgBox("Update Class Failed " + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub

    Sub updateRoom()
        conn.Open()
        Try
            Call koneksi()
            Dim str As String
            str = "Update class set Student_Class = '" & cbClass1.Text & "', Class_Name = '" & txtRoomname.Text & "', Author = '" & Label4.Text & "' where ID_Class = '" & txtIdclass.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Class Success")
        Catch ex As Exception
            MsgBox("Update Class Failed " + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
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
    Sub searchdata()
        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT * FROM class WHERE ID_Class like '%" & txtSearch.Text & "%' or Student_Class like '%" & txtSearch.Text & "%' or  Class_Name like '%" & txtSearch.Text & "%'", conn)
        da.Fill(Table)
        tableRoom.DataSource = Table
    End Sub
    Private Sub txtSearch_TextChanged(sender As Object, e As EventArgs) Handles txtSearch.TextChanged
        searchdata()
    End Sub
End Class