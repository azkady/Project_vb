<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class tableSchedule
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(tableSchedule))
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.btnBack = New System.Windows.Forms.Button()
        Me.btnDelete = New System.Windows.Forms.Button()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Button4 = New System.Windows.Forms.Button()
        Me.txtSearch = New System.Windows.Forms.TextBox()
        Me.txtIdSchedule = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.tableSchedule1 = New System.Windows.Forms.DataGridView()
        Me.btnUp = New System.Windows.Forms.Button()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.txtStudent = New System.Windows.Forms.TextBox()
        Me.txtRoom = New System.Windows.Forms.TextBox()
        Me.txtStart = New System.Windows.Forms.TextBox()
        Me.txtEnd = New System.Windows.Forms.TextBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.DatePicker = New System.Windows.Forms.DateTimePicker()
        Me.cbTeacherName = New System.Windows.Forms.ComboBox()
        Me.btnPrint = New System.Windows.Forms.Button()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.tableSchedule1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox1.BackgroundImage = CType(resources.GetObject("PictureBox1.BackgroundImage"), System.Drawing.Image)
        Me.PictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox1.Location = New System.Drawing.Point(561, 404)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(154, 103)
        Me.PictureBox1.TabIndex = 102
        Me.PictureBox1.TabStop = False
        '
        'btnBack
        '
        Me.btnBack.Location = New System.Drawing.Point(637, 352)
        Me.btnBack.Name = "btnBack"
        Me.btnBack.Size = New System.Drawing.Size(96, 30)
        Me.btnBack.TabIndex = 98
        Me.btnBack.Text = "Back to Menu"
        Me.btnBack.UseVisualStyleBackColor = True
        '
        'btnDelete
        '
        Me.btnDelete.Location = New System.Drawing.Point(535, 352)
        Me.btnDelete.Name = "btnDelete"
        Me.btnDelete.Size = New System.Drawing.Size(96, 30)
        Me.btnDelete.TabIndex = 97
        Me.btnDelete.Text = "Delete Data"
        Me.btnDelete.UseVisualStyleBackColor = True
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Font = New System.Drawing.Font("Microsoft Sans Serif", 21.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.ForeColor = System.Drawing.Color.White
        Me.Label5.Location = New System.Drawing.Point(179, 21)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(411, 33)
        Me.Label5.TabIndex = 96
        Me.Label5.Text = "UPDATE SCHEDULE FORM"
        '
        'Button4
        '
        Me.Button4.Location = New System.Drawing.Point(336, 87)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(91, 32)
        Me.Button4.TabIndex = 95
        Me.Button4.Text = "Search"
        Me.Button4.UseVisualStyleBackColor = True
        '
        'txtSearch
        '
        Me.txtSearch.Enabled = False
        Me.txtSearch.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtSearch.Location = New System.Drawing.Point(12, 87)
        Me.txtSearch.Multiline = True
        Me.txtSearch.Name = "txtSearch"
        Me.txtSearch.Size = New System.Drawing.Size(309, 32)
        Me.txtSearch.TabIndex = 94
        '
        'txtIdSchedule
        '
        Me.txtIdSchedule.Enabled = False
        Me.txtIdSchedule.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtIdSchedule.Location = New System.Drawing.Point(637, 89)
        Me.txtIdSchedule.Multiline = True
        Me.txtIdSchedule.Name = "txtIdSchedule"
        Me.txtIdSchedule.Size = New System.Drawing.Size(185, 30)
        Me.txtIdSchedule.TabIndex = 93
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label4.ForeColor = System.Drawing.Color.White
        Me.Label4.Location = New System.Drawing.Point(442, 197)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(186, 29)
        Me.Label4.TabIndex = 92
        Me.Label4.Text = "Teacher Name"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label3.ForeColor = System.Drawing.Color.White
        Me.Label3.Location = New System.Drawing.Point(442, 161)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(158, 29)
        Me.Label3.TabIndex = 91
        Me.Label3.Text = "Room Name"
        '
        'tableSchedule1
        '
        Me.tableSchedule1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.tableSchedule1.Location = New System.Drawing.Point(12, 131)
        Me.tableSchedule1.Name = "tableSchedule1"
        Me.tableSchedule1.Size = New System.Drawing.Size(415, 376)
        Me.tableSchedule1.TabIndex = 90
        '
        'btnUp
        '
        Me.btnUp.Location = New System.Drawing.Point(433, 352)
        Me.btnUp.Name = "btnUp"
        Me.btnUp.Size = New System.Drawing.Size(96, 30)
        Me.btnUp.TabIndex = 89
        Me.btnUp.Text = "Update Data"
        Me.btnUp.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label2.ForeColor = System.Drawing.Color.White
        Me.Label2.Location = New System.Drawing.Point(442, 125)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(174, 29)
        Me.Label2.TabIndex = 88
        Me.Label2.Text = "Student Class"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label1.ForeColor = System.Drawing.Color.White
        Me.Label1.Location = New System.Drawing.Point(442, 87)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(155, 29)
        Me.Label1.TabIndex = 87
        Me.Label1.Text = "ID Schedule"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label6.ForeColor = System.Drawing.Color.White
        Me.Label6.Location = New System.Drawing.Point(442, 233)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(134, 29)
        Me.Label6.TabIndex = 103
        Me.Label6.Text = "Start Time"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label7.ForeColor = System.Drawing.Color.White
        Me.Label7.Location = New System.Drawing.Point(442, 269)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(126, 29)
        Me.Label7.TabIndex = 104
        Me.Label7.Text = "End Time"
        '
        'txtStudent
        '
        Me.txtStudent.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtStudent.Location = New System.Drawing.Point(637, 125)
        Me.txtStudent.Multiline = True
        Me.txtStudent.Name = "txtStudent"
        Me.txtStudent.Size = New System.Drawing.Size(185, 30)
        Me.txtStudent.TabIndex = 105
        '
        'txtRoom
        '
        Me.txtRoom.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtRoom.Location = New System.Drawing.Point(637, 161)
        Me.txtRoom.Multiline = True
        Me.txtRoom.Name = "txtRoom"
        Me.txtRoom.Size = New System.Drawing.Size(185, 30)
        Me.txtRoom.TabIndex = 106
        '
        'txtStart
        '
        Me.txtStart.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtStart.Location = New System.Drawing.Point(637, 233)
        Me.txtStart.Multiline = True
        Me.txtStart.Name = "txtStart"
        Me.txtStart.Size = New System.Drawing.Size(185, 30)
        Me.txtStart.TabIndex = 108
        '
        'txtEnd
        '
        Me.txtEnd.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtEnd.Location = New System.Drawing.Point(637, 269)
        Me.txtEnd.Multiline = True
        Me.txtEnd.Name = "txtEnd"
        Me.txtEnd.Size = New System.Drawing.Size(185, 30)
        Me.txtEnd.TabIndex = 109
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label8.ForeColor = System.Drawing.Color.White
        Me.Label8.Location = New System.Drawing.Point(442, 305)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(67, 29)
        Me.Label8.TabIndex = 110
        Me.Label8.Text = "Date"
        '
        'DatePicker
        '
        Me.DatePicker.Location = New System.Drawing.Point(637, 306)
        Me.DatePicker.MinimumSize = New System.Drawing.Size(185, 30)
        Me.DatePicker.Name = "DatePicker"
        Me.DatePicker.Size = New System.Drawing.Size(185, 30)
        Me.DatePicker.TabIndex = 111
        '
        'cbTeacherName
        '
        Me.cbTeacherName.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.cbTeacherName.FormattingEnabled = True
        Me.cbTeacherName.Location = New System.Drawing.Point(637, 196)
        Me.cbTeacherName.MinimumSize = New System.Drawing.Size(185, 0)
        Me.cbTeacherName.Name = "cbTeacherName"
        Me.cbTeacherName.Size = New System.Drawing.Size(185, 32)
        Me.cbTeacherName.TabIndex = 112
        '
        'btnPrint
        '
        Me.btnPrint.Location = New System.Drawing.Point(739, 352)
        Me.btnPrint.Name = "btnPrint"
        Me.btnPrint.Size = New System.Drawing.Size(83, 30)
        Me.btnPrint.TabIndex = 113
        Me.btnPrint.Text = "Print"
        Me.btnPrint.UseVisualStyleBackColor = True
        '
        'tableSchedule
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.DarkOrchid
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(825, 519)
        Me.Controls.Add(Me.btnPrint)
        Me.Controls.Add(Me.cbTeacherName)
        Me.Controls.Add(Me.DatePicker)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.txtEnd)
        Me.Controls.Add(Me.txtStart)
        Me.Controls.Add(Me.txtRoom)
        Me.Controls.Add(Me.txtStudent)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.btnBack)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.txtSearch)
        Me.Controls.Add(Me.txtIdSchedule)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.tableSchedule1)
        Me.Controls.Add(Me.btnUp)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.MinimumSize = New System.Drawing.Size(185, 39)
        Me.Name = "tableSchedule"
        Me.Text = "Schedule_Update"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.tableSchedule1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents btnBack As Button
    Friend WithEvents btnDelete As Button
    Friend WithEvents Label5 As Label
    Friend WithEvents Button4 As Button
    Friend WithEvents txtSearch As TextBox
    Friend WithEvents txtIdSchedule As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents tableSchedule1 As DataGridView
    Friend WithEvents btnUp As Button
    Friend WithEvents Label2 As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents txtStudent As TextBox
    Friend WithEvents txtRoom As TextBox
    Friend WithEvents txtStart As TextBox
    Friend WithEvents txtEnd As TextBox
    Friend WithEvents Label8 As Label
    Friend WithEvents DatePicker As DateTimePicker
    Friend WithEvents cbTeacherName As ComboBox
    Friend WithEvents btnPrint As Button
End Class
