Imports MySql.Data.MySqlClient
Public Class Room_Add
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter
    Dim ds As New DataSet
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles btnLroom.Click
        Me.Hide()
        Room_Update.Show()
    End Sub

    Private Sub btnSaveroom_Click(sender As Object, e As EventArgs) Handles btnSaveroom.Click
        Call koneksi()
        conn.Open()
        Try
            Dim str As String
            str = "insert into class (ID_Class, Student_Class, Class_Name, Author) values ( '" & "', '" & cbClass.Text & "','" & txtRoomname.Text & "','" & Label3.Text & "')"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Insert Data success")
        Catch ex As Exception
            MsgBox("Data gagal disimpan " + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub

    Sub comboboxClass()
        conn.Open()
        Dim str As String
        str = "select Student_Class from student"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cbClass.Items.Add(rd("Student_Class"))
            Loop
        Else
        End If
        conn.Close()
    End Sub


    Private Sub Room_Add_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call comboboxClass()
        Label3.Text = ConnectionDB.session
    End Sub
End Class