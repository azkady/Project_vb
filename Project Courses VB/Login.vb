Imports MySql.Data.MySqlClient
Imports System.Drawing
Imports ProjectCoursesVB.ConnectionDB
Imports System.Drawing.Drawing2D
Public Class Login
    Private Sub InitializeMyControl()
        txtUsername.Text = ""
        txtPassword.PasswordChar = "*"
        txtPassword.MaxLength = 20
    End Sub
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim perintah As New MySqlCommand
    Dim data As New MySqlDataAdapter

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    Private Sub TextBox2_TextChanged(sender As Object, e As EventArgs) Handles txtPassword.TextChanged

    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles txtUsername.TextChanged

    End Sub

    Private Sub Label2_Click(sender As Object, e As EventArgs) Handles Label2.Click

    End Sub

    Private Sub Label3_Click(sender As Object, e As EventArgs) Handles Label3.Click

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnLogin.Click
        conn.Open()
        Dim str As String
        str = "select Username, Password from admin where Username ='" + txtUsername.Text + "' AND Password ='" + txtPassword.Text + " ' "
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader

        If rd.HasRows = 0 Then
            MsgBox("Username & Password incorrect",
            MsgBoxStyle.Exclamation, "Error Login")
        Else
            MsgBox("Successfull Login, Welcome " & txtUsername.Text & "!", MsgBoxStyle.Information, "Successfull Login")
            Main_Menu.Show()
            Me.Hide()
        End If
        conn.Close()
    End Sub
End Class