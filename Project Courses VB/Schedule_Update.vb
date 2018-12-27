Imports MySql.Data.MySqlClient
Public Class tableSchedule
    Dim conn As New MySqlConnection("datasource=localhost;port=3306;username=root;password=;database=courses_project; Convert Zero Datetime=True")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter
    Dim ds As New DataSet
    Private Sub Schedule_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call refreshTable()
        Call cClass()
        Call cRoom()
        Call cTeacher()
        Label10.Text = ConnectionDB.session
    End Sub
    Sub cClass()
        conn.Open()
        Dim str As String
        str = "select Student_Class from student"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cboxClass.Items.Add(rd("Student_Class"))
            Loop
        Else
        End If
        conn.Close()
    End Sub
    Sub cRoom()
        conn.Open()
        Dim str As String
        str = "select Class_Name from class"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cboxRoom.Items.Add(rd("Class_Name"))
            Loop
        Else
        End If
        conn.Close()
    End Sub
    Sub cTeacher()
        conn.Open()
        Dim str As String
        str = "select Teacher_ID from teacher"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cboxTeacher.Items.Add(rd("Teacher_ID"))
            Loop
        Else
        End If
        conn.Close()
    End Sub
    Sub deleteSchedule()
        conn.Open()
        Try
            Call koneksi()
            Dim str As String
            str = "delete from room_schedule where ID_Schedule = '" & txtIdSchedule.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Success")
        Catch ex As Exception
            MsgBox("Delete Class Failed " + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub

    Sub updateSchedule()
        conn.Open()
        Try
            Call koneksi()
            Dim str As String
            str = "Update room_schedule set Teacher_ID = '" & cboxTeacher.Text & "', Student_Class = '" & cboxClass.Text & "', Class_Name = '" & cboxRoom.Text & "', Start_Time = '" & txtStart.Text & "', End_Time = '" & txtEnd.Text & "', Date = '" & Convert.ToDateTime(DatePicker.Value).ToString("yyyy-MM-dd") & "', Author = '" & Label10.Text & "' where ID_Schedule = '" & txtIdSchedule.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Class Success")
        Catch ex As Exception
            MsgBox("Update Class Failed " + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub
    Sub refreshTable()
        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT * FROM room_schedule", conn)
        da.Fill(Table)
        tableSchedule1.DataSource = Table
    End Sub

    Private Sub tableSchedule1_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles tableSchedule1.CellMouseClick
        txtIdSchedule.Text = tableSchedule1.Rows(e.RowIndex).Cells(0).Value
        cboxClass.Text = tableSchedule1.Rows(e.RowIndex).Cells(1).Value
        cboxRoom.Text = tableSchedule1.Rows(e.RowIndex).Cells(2).Value
        cboxTeacher.Text = tableSchedule1.Rows(e.RowIndex).Cells(3).Value
        txtStart.Text = tableSchedule1.Rows(e.RowIndex).Cells(4).Value
        txtEnd.Text = tableSchedule1.Rows(e.RowIndex).Cells(5).Value
        DatePicker.Text = tableSchedule1.Rows(e.RowIndex).Cells(6).Value
    End Sub
    Private Sub btnUp_Click(sender As Object, e As EventArgs) Handles btnUp.Click
        Call updateSchedule()
        Call refreshTable()
    End Sub
    Private Sub btnDelete_Click(sender As Object, e As EventArgs) Handles btnDelete.Click
        Call deleteSchedule()
        Call refreshTable()
    End Sub
    Private Sub btnBack_Click(sender As Object, e As EventArgs) Handles btnBack.Click
        Me.Hide()
        Main_Menu.Show()
    End Sub
End Class