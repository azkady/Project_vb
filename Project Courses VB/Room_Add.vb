Imports MySql.Data.MySqlClient
Public Class Room_Add
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim conn2 As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter

    Dim ds As New DataSet

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles btnLroom.Click
        Me.Hide()
        Room_Update.Show()
    End Sub

    Private Sub btnSaveroom_Click(sender As Object, e As EventArgs) Handles btnSaveroom.Click
        conn.Open()
        Try
            cmd.CommandType = CommandType.Text
            cmd.CommandText = "SELECT COUNT ('Student_ID') FROM student WHERE Student_Class = '" & txtStudentClass.Text & "'"
            cmd.Connection = conn
            rd = cmd.ExecuteReader()




            cmd.CommandType = CommandType.Text
            cmd.CommandText = "INSERT INTO Class (Student_Class, Class_Name, Capacity) VALUES ('" & txtRoomname.Text & "', '" & txtStudentClass.Text & "', '" & txtCapacity.Text & "')"
            cmd.Connection = conn2
            cmd.ExecuteNonQuery()
            MsgBox("Data berhasil disimpan", MsgBoxStyle.Information, "Informasi")
        Catch ex As Exception
            MsgBox("Data gagal disimpan" + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub

    Private Sub Label3_Click(sender As Object, e As EventArgs) Handles Label3.Click

    End Sub
End Class