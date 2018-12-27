Public Class Teacher_Add
    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles txtfullname.TextChanged

    End Sub

    Private Sub TextBox2_TextChanged(sender As Object, e As EventArgs) Handles txtLesson.TextChanged

    End Sub

    Private Sub Label2_Click(sender As Object, e As EventArgs) Handles Label2.Click

    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    Private Sub btnLteacher_Click(sender As Object, e As EventArgs) Handles btnLteacher.Click
        Me.Hide()
        Teacher_Update.Show()
    End Sub
End Class