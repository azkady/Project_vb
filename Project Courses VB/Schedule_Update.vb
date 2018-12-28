Imports MySql.Data.MySqlClient
Public Class tableSchedule
    Private Sub Schedule_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call refreshTable()
    End Sub
    Sub deleteSchedule()
        Try
            Call koneksi()
            Dim str As String
            str = "delete from room_schedule where ID_Schedule = '" & txtIdSchedule.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Success")
        Catch ex As Exception
            MessageBox.Show("Delete Failed")
        End Try
    End Sub

    Sub updateSchedule()
        Dim author As String
        Try
            Call koneksi()
            Dim str As String
            str = "Update class set Teacher_ID = '" & txtTeacher.Text & "', Student_Class = '" & txtStudent.Text & "', Class_Name = '" & txtRoom.Text & "', Start_Time = '" & txtStart.Text & "', End_Time = '" & txtEnd.Text & "', Date = '" & DatePicker.Text & "', Author = '" & author & "' where ID_Class = '" & txtIdSchedule.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Class Success")
        Catch ex As Exception
            MessageBox.Show("Update Class Failed")
        End Try
    End Sub

    Sub checkdb()
        Dim author As String
        Try
            Call koneksi()
            Dim str As String
            str = "Update class set Teacher_ID = '" & txtTeacher.Text & "', Student_Class = '" & txtStudent.Text & "', Class_Name = '" & txtRoom.Text & "', Start_Time = '" & txtStart.Text & "', End_Time = '" & txtEnd.Text & "', Date = '" & DatePicker.Text & "', Author = '" & author & "' where ID_Class = '" & txtIdSchedule.Text & "'"
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
        da = New MySqlDataAdapter("SELECT * FROM room_schedule", conn)
        da.Fill(Table)
        tableSchedule1.DataSource = Table
    End Sub

    Private Sub tableSchedule1_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles tableSchedule1.CellMouseClick
        txtIdSchedule.Text = tableSchedule1.Rows(e.RowIndex).Cells(0).Value
        txtStudent.Text = tableSchedule1.Rows(e.RowIndex).Cells(1).Value
        txtRoom.Text = tableSchedule1.Rows(e.RowIndex).Cells(2).Value
        txtTeacher.Text = tableSchedule1.Rows(e.RowIndex).Cells(3).Value
        txtStart.Text = tableSchedule1.Rows(e.RowIndex).Cells(4).Value
        txtEnd.Text = tableSchedule1.Rows(e.RowIndex).Cells(5).Value
        DatePicker.Text = tableSchedule1.Rows(e.RowIndex).Cells(6).Value
    End Sub
    Private Sub btnUp_Click(sender As Object, e As EventArgs) Handles btnUp.Click
        Call updateSchedule()
        Call refreshTable()
    End Sub
    Private Sub btnDelete_Click(sender As Object, e As EventArgs) Handles btnDelete.Click
        Call deleteSchedule()
        Call refreshTable()
    End Sub
    Private Sub btnBack_Click(sender As Object, e As EventArgs) Handles btnBack.Click
        Me.Hide()
        Main_Menu.Show()
    End Sub
End Class