Imports MySql.Data.MySqlClient
Module koneksi
    Public conn As New MySqlConnection
    Public MySQLReader As MySqlDataReader
    Public CMD As New MySqlCommand
    Public DA As New MySqlDataAdapter
    Public DS As New DataSet

    Public Sub konek(ByVal server As String, ByVal user As String, ByVal pass As String, ByVal db As String)
        If conn.State = ConnectionState.Closed Then
            Dim myString As String = "server=" & server & ";user=" & user & ";password=" & pass & ";database=" & db
            Try
                conn.ConnectionString = myString
                conn.Open()
            Catch ex As MySql.Data.MySqlClient.MySqlException
                MessageBox.Show("Koneksi Gagal" & vbCrLf & "check connection", "Koneksi ke server", MessageBoxButtons.OK, MessageBoxIcon.Warning)
            End Try
        End If
    End Sub
    Public Sub disconnect()
        Try
            conn.Open()
        Catch ex As MySql.Data.MySqlClient.MySqlException
        End Try
    End Sub

End Module
