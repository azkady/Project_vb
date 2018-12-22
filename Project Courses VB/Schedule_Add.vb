Imports MySql.Data.MySqlClient
Public Class Schedule_Add
    Private Sub btnLstudent_Click(sender As Object, e As EventArgs) Handles btnLschedule.Click
        Me.Hide()
        Schedule_Update.Show()
    End Sub
    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        Call koneksi()
        Dim author As String
        Try
            Dim str As String
            str = "insert into room_schedule values ('" & teacherId.Text & "','" & txtClassname.Text & "',,'" & txtRoomname.Text & "','" & txtStart.Text & "','" & txtEnd.Text & "','" & datePicker.Text & "','" & author & "')"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Insert Data success")
        Catch ex As Exception
            MessageBox.Show("Insert Data Failed")
        End Try
    End Sub
End Class