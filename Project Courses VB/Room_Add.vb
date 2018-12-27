Imports MySql.Data.MySqlClient
Public Class Room_Add


    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles btnLroom.Click
        Me.Hide()
        Room_Update.Show()
    End Sub

    Private Sub btnSaveroom_Click(sender As Object, e As EventArgs) Handles btnSaveroom.Click
        Call koneksi()
        Dim author As String
        Try
            Dim str As String
            str = "insert into class (ID_Class, Student_Class, Class_Name) values ( '" & "', '" & txtStudentClass.Text & "','" & txtRoomname.Text & "')"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Insert Data success")
        Catch ex As Exception
            MessageBox.Show("Insert Data Failed")
        End Try
    End Sub
End Class