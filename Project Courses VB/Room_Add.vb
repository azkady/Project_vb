Public Class Room_Add
    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) 

    End Sub

    Private Sub Label1_Click(sender As Object, e As EventArgs) 

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles btnLroom.Click
        Me.Hide()
        Room_Update.Show()
    End Sub
End Class