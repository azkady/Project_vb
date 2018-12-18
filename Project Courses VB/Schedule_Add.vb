Public Class Schedule_Add
    Private Sub DateTimePicker1_ValueChanged(sender As Object, e As EventArgs) Handles DateTimePicker1.ValueChanged

    End Sub

    Private Sub btnLstudent_Click(sender As Object, e As EventArgs) Handles btnLschedule.Click
        Me.Hide()
        Schedule_Update.Show()
    End Sub
End Class