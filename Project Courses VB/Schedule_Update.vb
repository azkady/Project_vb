Imports MySql.Data.MySqlClient
Imports ProjectCoursesVB.ConnectionDB
Public Class tableSchedule
    Dim conn As New MySqlConnection("Server=localhost; user=root; database=courses_project")
    Dim cmd As New MySqlCommand
    Dim data As New MySqlDataAdapter

    Dim ds As New DataSet

    Sub SetDataGrid()
        Try
            tableSchedule1.Columns(0).Width = 50
            tableSchedule1.Columns(1).Width = 100
            tableSchedule1.Columns(2).Width = 100
            tableSchedule1.Columns(3).Width = 100
            tableSchedule1.Columns(4).Width = 100
            tableSchedule1.Columns(5).Width = 100
            tableSchedule1.Columns(6).Width = 100


            tableSchedule1.Columns(0).HeaderText = "ID"
            tableSchedule1.Columns(1).HeaderText = "Student Class"
            tableSchedule1.Columns(2).HeaderText = "Room Name"
            tableSchedule1.Columns(3).HeaderText = "Teacher Name"
            tableSchedule1.Columns(4).HeaderText = "Start Time"
            tableSchedule1.Columns(5).HeaderText = "End Time"
            tableSchedule1.Columns(6).HeaderText = "Date"

        Catch ex As Exception
        End Try
    End Sub

    Sub showSchedule()
        conn.Open()
        da = New MySqlDataAdapter("select ID_Schedule, Student_Class, Class_Name, Teacher_Name, Start_Time, End_Time, Date from room_schedule", conn)
        ds = New DataSet
        da.Fill(ds, "room_schedule")
        tableSchedule1.DataSource = ds.Tables("room_schedule")
        conn.Close()
    End Sub

    Private Sub Schedule_Update_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Call showSchedule()
        Call SetDataGrid()
    End Sub

    Private Sub tableSchedule1_CellContentClick(sender As Object, e As DataGridViewCellEventArgs) Handles tableSchedule1.CellContentClick

    End Sub

    Private Sub tableSchedule1_CellMouseClick(sender As Object, e As DataGridViewCellMouseEventArgs) Handles tableSchedule1.CellMouseClick
        If tableSchedule1().RowCount > 0 Then
            Dim baris As Integer
            With tableSchedule1
                baris = .CurrentRow.Index
                txtIdSchedule.Text = .Item(0, baris).Value.ToString
                txtStudent.Text = .Item(1, baris).Value.ToString
                txtRoom.Text = .Item(2, baris).Value.ToString
                cbTeacherName.Text = .Item(3, baris).Value.ToString
                txtStart.Text = .Item(4, baris).Value.ToString
                txtEnd.Text = .Item(5, baris).Value.ToString
                DatePicker.Text = .Item(6, baris).Value.ToString


                cbTeacherName.Enabled = True
                txtStart.Enabled = True
                txtEnd.Enabled = True
                DatePicker.Enabled = True

                cbTeacherName.Focus()

            End With
        End If
    End Sub


    Private Sub load_Teacher_Name(sender As Object, e As EventArgs) Handles MyBase.Load

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


    Sub deleteSchedule()
        conn.Open()
        Try
            Call koneksi()
            Dim str As String
            str = "delete from room_schedule where ID_Schedule = '" & txtIdSchedule.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Delete Schedule Success")
        Catch ex As Exception
            MessageBox.Show("Delete Schedule Failed")
        End Try
        conn.Close()
    End Sub
    Sub updateStudent()
        Dim author As String
        conn.Open()
        Try
            Call koneksi()
            Dim str As String
            str = "Update room_schedule set Teacher_Name = '" & cbTeacherName.Text & "', Start_Time = '" & txtStart.Text & "', End_Time = '" & txtEnd.Text & "', Date = '" & DatePicker.Text & "' where ID_Schedule = '" & txtIdSchedule.Text & "'"
            cmd = New MySqlCommand(str, conn)
            cmd.ExecuteNonQuery()
            MessageBox.Show("Update Schedule Success")
        Catch ex As Exception
            MessageBox.Show("Update Schedule Failed")
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

    Sub searchdata()

        Call koneksi()
        Dim Table As New DataTable()
        da = New MySqlDataAdapter("SELECT ID_Schedule, Teacher_Name, Student_Class, Class_Name, Start_Time, End_Time, Date FROM room_schedule WHERE ID_Schedule like '%" & txtSearch.Text & "%' or Teacher_Name like '%" & txtSearch.Text & "%' or Student_Class like '%" & txtSearch.Text & "%' or Class_Name like '%" & txtSearch.Text & "%' or Start_Time like '%" & txtSearch.Text & "%' or End_Time like '%" & txtSearch.Text & "%' or Date like '%" & txtSearch.Text & "%'", conn)
        da.Fill(Table)
        tableSchedule1.DataSource = Table
    End Sub

    Private Sub btnDelete_Click(sender As Object, e As EventArgs) Handles btnDelete.Click
        Call deleteSchedule()
        refreshTable()
    End Sub

    Private Sub btnUp_Click(sender As Object, e As EventArgs) Handles btnUp.Click
        updateStudent()
        refreshTable()
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        txtSearch.Enabled = True
        searchdata()
    End Sub

    Private Sub btnBack_Click(sender As Object, e As EventArgs) Handles btnBack.Click
        Me.Hide()
        Main_Menu.Show()
    End Sub
End Class