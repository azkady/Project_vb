Imports MySql.Data.MySqlClient
Public Class Student_Add
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter
    Dim ds As New DataSet
    Private Sub btnLstudent_Click(sender As Object, e As EventArgs) Handles btnListStudent.Click
        Me.Hide()
        Student_Update.Show()
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnAddStudent.Click
        conn.Open()
        Try
            cmd.CommandType = CommandType.Text
            cmd.CommandText = "INSERT INTO student ( Student_Name, Student_Class, Student_Contact, Author) VALUES ('" & txtName.Text & "', '" & cbClass.Text & "', '" & txtContact.Text & "', '" & Label5.Text & "')"
            cmd.Connection = conn
            cmd.ExecuteNonQuery()
            MsgBox("Data berhasil disimpan", MsgBoxStyle.Information, "Informasi")
        Catch ex As Exception
            MsgBox("Data gagal disimpan" + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub

    Private Sub Student_Add_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call comboboxClass()
        Label5.Text = ConnectionDB.session
    End Sub
    Sub comboboxClass()
        conn.Open()
        Dim str As String
        str = "select Student_Class from class"
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
End Class