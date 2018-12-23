Public Class Main_Menu
    Private Sub Main_Menu_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub PictureBox4_Click(sender As Object, e As EventArgs) Handles frmSchedule.Click
        Me.Hide()
        Schedule_Add.Show()
    End Sub

    Private Sub PictureBox3_Click(sender As Object, e As EventArgs) Handles frmClass.Click
        Me.Hide()
        Room_Add.Show()
    End Sub

    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles frmStudent.Click
        Me.Hide()
        Student_Add.Show()
    End Sub

    Private Sub PictureBox2_Click(sender As Object, e As EventArgs)

    End Sub

    Private Sub Label5_Click(sender As Object, e As EventArgs) Handles Label5.Click

    End Sub

    Private Sub frmTeacher_Click(sender As Object, e As EventArgs) Handles frmTeacher.Click
        Me.Hide()
        Teacher_Add.Show()

    End Sub
End Class