Imports MySql.Data.MySqlClient
Public Class Schedule_Add
    Dim conn As New MySqlConnection("datasource=localhost;username=root;password=;database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter
    Dim ds As New DataSet
    Private Sub btnLstudent_Click(sender As Object, e As EventArgs) Handles btnLschedule.Click
        Me.Hide()
        tableSchedule.Show()
    End Sub
    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click
        Call koneksi()
        conn.Open()
        Try
            Dim str As String
            str = "insert into room_schedule (ID_Schedule, Teacher_ID, Student_Class, Class_Name, Start_Time, End_Time, Date, Author) values ( '" & "', '" & cbTeacher.Text & "','" & cbClass.Text & "','" & cbRoom.Text & "','" & txtStart.Text & "','" & txtEnd.Text & "','" & Convert.ToDateTime(datePicker.Value).ToString("yyyy-MM-dd") & "','" & Label8.Text & "')"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Insert Data success")
        Catch ex As Exception
            MsgBox("Data gagal disimpan " + ex.Message, MsgBoxStyle.Critical)
        End Try
        conn.Close()
    End Sub
    Sub cClass()
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
    Sub cRoom()
        conn.Open()
        Dim str As String
        str = "select Class_Name from class"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cbRoom.Items.Add(rd("Class_Name"))
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
                cbTeacher.Items.Add(rd("Teacher_ID"))
            Loop
        Else
        End If
        conn.Close()
    End Sub
    Private Sub Schedule_Add_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call cClass()
        Call cRoom()
        Call cTeacher()
        Label8.Text = ConnectionDB.session
    End Sub
End Class