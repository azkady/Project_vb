Imports MySql.Data.MySqlClient
Module ConnectionDB
    Public conn As MySqlConnection
    Public cmd As MySqlCommand
    Public rd As MySqlDataReader
    Public da As MySqlDataAdapter
    Public ds As DataSet
    Public str As String
    Sub koneksi()
        Try
            Dim str As String = "datasource=localhost;port=3306;username=root;password=;database=courses_project"
            conn = New MySqlConnection(str)
            If conn.State = ConnectionState.Closed Then
                conn.Open()
            End If
        Catch ex As Exception
            MessageBox.Show(ex.Message)
        End Try
    End Sub
End Module
