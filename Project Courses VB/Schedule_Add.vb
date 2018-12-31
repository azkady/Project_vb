Imports Project_Courses_VB.ConnectionDB
Imports MySql.Data.MySqlClient
Public Class Schedule_Add
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim conn2 As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter

    Dim ds As New DataSet
    Private Sub btnLstudent_Click(sender As Object, e As EventArgs) Handles btnLschedule.Click
        Me.Hide()
        tableSchedule.Show()
    End Sub

    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click

        conn.Open()
        conn2.open()

        cmd.CommandType = CommandType.Text
        cmd.CommandText = "SELECT Class_Name, Date,Start_Time,End_Time from room_schedule where Class_Name = '" & cbRoomName.Text & "' AND Date = '" & datePicker.Text.ToString & "' AND  Start_Time = '" & txtStart.Text & "' AND  End_Time = '" & txtEnd.Text & "'"
        cmd.Connection = conn
        rd = cmd.ExecuteReader()

        If rd.HasRows <> 0 Then
            MsgBox("Sorry date, Start time, already exist")

        Else

            cmd.CommandType = CommandType.Text
<<<<<<< HEAD
            cmd.CommandText = "INSERT INTO room_schedule ( Teacher_ID, Student_Class, Class_Name, Start_Time, End_Time, Date) VALUES ('" & cbTeacherID.Text & "', '" & cbClassName.Text & "', '" & cbRoomName.Text & "','" & txtStart.Text & "','" & txtEnd.Text & "','" & datePicker.Text & "')"
            cmd.Connection = conn2
=======
            cmd.CommandText = "INSERT INTO room_schedule ( Teacher_Name, Student_Class, Class_Name, Start_Time, End_Time, Date) VALUES ('" & cbTeacherName.Text & "', '" & cbClassName.Text & "', '" & cbRoomName.Text & "','" & txtStart.Text & "','" & txtEnd.Text & "','" & datePicker.Text & "')"
            cmd.Connection = conn
>>>>>>> 897b6f2cdb4032b674e35e436e749138ae36d40f
            cmd.ExecuteNonQuery()
            MsgBox("Data berhasil disimpan", MsgBoxStyle.Information, "Informasi")
        End If
        conn.Close()
        conn2.Close()


    End Sub

    Private Sub Load_Teacher_Name(sender As Object, e As EventArgs) Handles MyBase.Load

        Call comboboxClass_Teacher_Name()
    End Sub

    Sub comboboxClass_Teacher_Name()
        conn.Open()
        Dim str As String
        str = "select Teacher_Name from teacher"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cbTeacherName.Items.Add(rd("Teacher_Name"))
            Loop
        Else
        End If
        conn.Close()
    End Sub


    Private Sub load_Class_Name(sender As Object, e As EventArgs) Handles MyBase.Load

        Call comboboxClass_Class_Name()
    End Sub

    Sub comboboxClass_Class_Name()
        conn.Open()
        Dim str As String
        str = "select Student_Class from class"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cbClassName.Items.Add(rd("Student_Class"))
            Loop
        Else
        End If
        conn.Close()
    End Sub

    Private Sub Load_Room_Name(sender As Object, e As EventArgs) Handles MyBase.Load

        Call comboboxClass_Room_Name()
    End Sub

    Sub comboboxClass_Room_Name()
        conn.Open()
        Dim str As String
        str = "select Class_Name from class"
        cmd = New MySqlCommand(str, conn)
        rd = cmd.ExecuteReader
        If rd.HasRows Then
            Do While rd.Read
                cbRoomName.Items.Add(rd("Class_Name"))
            Loop
        Else
        End If
        conn.Close()
    End Sub

    Private Sub cbRoomName_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cbRoomName.SelectedIndexChanged

    End Sub
End Class