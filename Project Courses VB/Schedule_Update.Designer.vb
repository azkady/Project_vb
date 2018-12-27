<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class tableSchedule
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
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
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(tableSchedule))
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.btnBack = New System.Windows.Forms.Button()
        Me.btnDelete = New System.Windows.Forms.Button()
        Me.Label5 = New System.Windows.Forms.Label()
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
        Me.txtStart = New System.Windows.Forms.TextBox()
        Me.txtEnd = New System.Windows.Forms.TextBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.DatePicker = New System.Windows.Forms.DateTimePicker()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.cboxClass = New System.Windows.Forms.ComboBox()
        Me.cboxRoom = New System.Windows.Forms.ComboBox()
        Me.cboxTeacher = New System.Windows.Forms.ComboBox()
        Me.Label10 = New System.Windows.Forms.Label()
        Me.comboClass = New System.Windows.Forms.ComboBox()
        Me.ComboBox2 = New System.Windows.Forms.ComboBox()
        Me.comboRoom = New System.Windows.Forms.ComboBox()
        Me.ComboBox3 = New System.Windows.Forms.ComboBox()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.tableSchedule1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox1.BackgroundImage = CType(resources.GetObject("PictureBox1.BackgroundImage"), System.Drawing.Image)
        Me.PictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox1.Location = New System.Drawing.Point(562, 404)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(154, 103)
        Me.PictureBox1.TabIndex = 102
        Me.PictureBox1.TabStop = False
        '
        'btnBack
        '
        Me.btnBack.Location = New System.Drawing.Point(708, 352)
        Me.btnBack.Name = "btnBack"
        Me.btnBack.Size = New System.Drawing.Size(96, 30)
        Me.btnBack.TabIndex = 98
        Me.btnBack.Text = "Back to Menu"
        Me.btnBack.UseVisualStyleBackColor = True
        '
        'btnDelete
        '
        Me.btnDelete.Location = New System.Drawing.Point(586, 352)
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
        Me.Label5.Location = New System.Drawing.Point(182, 9)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(411, 33)
        Me.Label5.TabIndex = 96
        Me.Label5.Text = "UPDATE SCHEDULE FORM"
        '
        'txtSearch
        '
        Me.txtSearch.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtSearch.Location = New System.Drawing.Point(118, 89)
        Me.txtSearch.Multiline = True
        Me.txtSearch.Name = "txtSearch"
        Me.txtSearch.Size = New System.Drawing.Size(309, 32)
        Me.txtSearch.TabIndex = 94
        '
        'txtIdSchedule
        '
        Me.txtIdSchedule.Enabled = False
        Me.txtIdSchedule.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtIdSchedule.Location = New System.Drawing.Point(628, 89)
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
        Me.Label4.Location = New System.Drawing.Point(448, 197)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(142, 29)
        Me.Label4.TabIndex = 92
        Me.Label4.Text = "Teacher ID"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label3.ForeColor = System.Drawing.Color.White
        Me.Label3.Location = New System.Drawing.Point(448, 161)
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
        Me.btnUp.Location = New System.Drawing.Point(453, 352)
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
        Me.Label2.Location = New System.Drawing.Point(448, 125)
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
        Me.Label1.Location = New System.Drawing.Point(448, 87)
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
        Me.Label6.Location = New System.Drawing.Point(448, 233)
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
        Me.Label7.Location = New System.Drawing.Point(448, 269)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(126, 29)
        Me.Label7.TabIndex = 104
        Me.Label7.Text = "End Time"
        '
        'txtStart
        '
        Me.txtStart.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtStart.Location = New System.Drawing.Point(628, 233)
        Me.txtStart.Multiline = True
        Me.txtStart.Name = "txtStart"
        Me.txtStart.Size = New System.Drawing.Size(185, 30)
        Me.txtStart.TabIndex = 108
        '
        'txtEnd
        '
        Me.txtEnd.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtEnd.Location = New System.Drawing.Point(628, 269)
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
        Me.Label8.Location = New System.Drawing.Point(448, 305)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(67, 29)
        Me.Label8.TabIndex = 110
        Me.Label8.Text = "Date"
        '
        'DatePicker
        '
        Me.DatePicker.Location = New System.Drawing.Point(628, 306)
        Me.DatePicker.MinimumSize = New System.Drawing.Size(185, 30)
        Me.DatePicker.Name = "DatePicker"
        Me.DatePicker.Size = New System.Drawing.Size(185, 30)
        Me.DatePicker.TabIndex = 111
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label9.ForeColor = System.Drawing.Color.White
        Me.Label9.Location = New System.Drawing.Point(12, 92)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(95, 29)
        Me.Label9.TabIndex = 112
        Me.Label9.Text = "Search"
        '
        'cboxClass
        '
        Me.cboxClass.FormattingEnabled = True
        Me.cboxClass.Location = New System.Drawing.Point(628, 125)
        Me.cboxClass.Name = "cboxClass"
        Me.cboxClass.Size = New System.Drawing.Size(185, 21)
        Me.cboxClass.TabIndex = 113
        '
        'cboxRoom
        '
        Me.cboxRoom.FormattingEnabled = True
        Me.cboxRoom.Location = New System.Drawing.Point(628, 161)
        Me.cboxRoom.Name = "cboxRoom"
        Me.cboxRoom.Size = New System.Drawing.Size(185, 21)
        Me.cboxRoom.TabIndex = 114
        '
        'cboxTeacher
        '
        Me.cboxTeacher.FormattingEnabled = True
        Me.cboxTeacher.Location = New System.Drawing.Point(628, 197)
        Me.cboxTeacher.Name = "cboxTeacher"
        Me.cboxTeacher.Size = New System.Drawing.Size(185, 21)
        Me.cboxTeacher.TabIndex = 115
        '
        'Label10
        '
        Me.Label10.AutoSize = True
        Me.Label10.Location = New System.Drawing.Point(43, 40)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(45, 13)
        Me.Label10.TabIndex = 116
        Me.Label10.Text = "Label10"
        '
        'comboClass
        '
        Me.comboClass.FormattingEnabled = True
        Me.comboClass.Location = New System.Drawing.Point(628, 125)
        Me.comboClass.Name = "comboClass"
        Me.comboClass.Size = New System.Drawing.Size(185, 21)
        Me.comboClass.TabIndex = 113
        '
        'ComboBox2
        '
        Me.ComboBox2.FormattingEnabled = True
        Me.ComboBox2.Location = New System.Drawing.Point(628, 161)
        Me.ComboBox2.Name = "ComboBox2"
        Me.ComboBox2.Size = New System.Drawing.Size(185, 21)
        Me.ComboBox2.TabIndex = 114
        '
        'comboRoom
        '
        Me.comboRoom.FormattingEnabled = True
        Me.comboRoom.Location = New System.Drawing.Point(628, 161)
        Me.comboRoom.Name = "comboRoom"
        Me.comboRoom.Size = New System.Drawing.Size(185, 21)
        Me.comboRoom.TabIndex = 114
        '
        'ComboBox3
        '
        Me.ComboBox3.FormattingEnabled = True
        Me.ComboBox3.Location = New System.Drawing.Point(628, 197)
        Me.ComboBox3.Name = "ComboBox3"
        Me.ComboBox3.Size = New System.Drawing.Size(185, 21)
        Me.ComboBox3.TabIndex = 115
        '
        'tableSchedule
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.DarkOrchid
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(825, 519)
        Me.Controls.Add(Me.Label10)
        Me.Controls.Add(Me.cboxTeacher)
        Me.Controls.Add(Me.cboxRoom)
        Me.Controls.Add(Me.cboxClass)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.DatePicker)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.txtEnd)
        Me.Controls.Add(Me.txtStart)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.btnBack)
        Me.Controls.Add(Me.btnDelete)
        Me.Controls.Add(Me.Label5)
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
    Friend WithEvents txtStart As TextBox
    Friend WithEvents txtEnd As TextBox
    Friend WithEvents Label8 As Label
    Friend WithEvents DatePicker As DateTimePicker
    Friend WithEvents ComboBox1 As ComboBox
    Friend WithEvents ComboBox2 As ComboBox
    Friend WithEvents ComboBox3 As ComboBox
    Friend WithEvents Label10 As Label
    Friend WithEvents Label9 As Label
    Friend WithEvents cboxClass As ComboBox
    Friend WithEvents cboxRoom As ComboBox
    Friend WithEvents cboxTeacher As ComboBox
    Friend WithEvents comboClass As ComboBox
    Friend WithEvents comboRoom As ComboBox
End Class
