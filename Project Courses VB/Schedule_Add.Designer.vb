<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Schedule_Add
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Schedule_Add))
        Me.btnLschedule = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.btnAdd = New System.Windows.Forms.Button()
        Me.txtStart = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.txtEnd = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.datePicker = New System.Windows.Forms.DateTimePicker()
        Me.cbClassName = New System.Windows.Forms.ComboBox()
        Me.cbRoomName = New System.Windows.Forms.ComboBox()
        Me.cbTeacherName = New System.Windows.Forms.ComboBox()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnLschedule
        '
        Me.btnLschedule.BackColor = System.Drawing.Color.CornflowerBlue
        Me.btnLschedule.Location = New System.Drawing.Point(241, 393)
        Me.btnLschedule.Name = "btnLschedule"
        Me.btnLschedule.Size = New System.Drawing.Size(120, 49)
        Me.btnLschedule.TabIndex = 40
        Me.btnLschedule.Text = "List Schedule"
        Me.btnLschedule.UseVisualStyleBackColor = False
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox1.BackgroundImage = CType(resources.GetObject("PictureBox1.BackgroundImage"), System.Drawing.Image)
        Me.PictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox1.Location = New System.Drawing.Point(188, 12)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(48, 37)
        Me.PictureBox1.TabIndex = 39
        Me.PictureBox1.TabStop = False
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label3.ForeColor = System.Drawing.Color.White
        Me.Label3.Location = New System.Drawing.Point(11, 198)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(205, 31)
        Me.Label3.TabIndex = 37
        Me.Label3.Text = "Teacher Name"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label1.ForeColor = System.Drawing.Color.White
        Me.Label1.Location = New System.Drawing.Point(11, 103)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(172, 31)
        Me.Label1.TabIndex = 35
        Me.Label1.Text = "Class Name"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, CType((System.Drawing.FontStyle.Bold Or System.Drawing.FontStyle.Italic), System.Drawing.FontStyle), System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.Color.White
        Me.Label4.Location = New System.Drawing.Point(81, 55)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(269, 31)
        Me.Label4.TabIndex = 34
        Me.Label4.Text = "Add Schedule Form"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label2.ForeColor = System.Drawing.Color.White
        Me.Label2.Location = New System.Drawing.Point(11, 152)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(174, 31)
        Me.Label2.TabIndex = 32
        Me.Label2.Text = "Room Name"
        '
        'btnAdd
        '
        Me.btnAdd.BackColor = System.Drawing.Color.CornflowerBlue
        Me.btnAdd.Location = New System.Drawing.Point(60, 393)
        Me.btnAdd.Name = "btnAdd"
        Me.btnAdd.Size = New System.Drawing.Size(120, 49)
        Me.btnAdd.TabIndex = 31
        Me.btnAdd.Text = "Add Schedule"
        Me.btnAdd.UseVisualStyleBackColor = False
        '
        'txtStart
        '
        Me.txtStart.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtStart.Location = New System.Drawing.Point(225, 238)
        Me.txtStart.Multiline = True
        Me.txtStart.Name = "txtStart"
        Me.txtStart.Size = New System.Drawing.Size(185, 40)
        Me.txtStart.TabIndex = 42
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label5.ForeColor = System.Drawing.Color.White
        Me.Label5.Location = New System.Drawing.Point(11, 244)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(149, 31)
        Me.Label5.TabIndex = 41
        Me.Label5.Text = "Start Time"
        '
        'txtEnd
        '
        Me.txtEnd.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtEnd.Location = New System.Drawing.Point(225, 284)
        Me.txtEnd.Multiline = True
        Me.txtEnd.Name = "txtEnd"
        Me.txtEnd.Size = New System.Drawing.Size(185, 40)
        Me.txtEnd.TabIndex = 44
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label6.ForeColor = System.Drawing.Color.White
        Me.Label6.Location = New System.Drawing.Point(11, 290)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(137, 31)
        Me.Label6.TabIndex = 43
        Me.Label6.Text = "End Time"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(128, Byte))
        Me.Label7.ForeColor = System.Drawing.Color.White
        Me.Label7.Location = New System.Drawing.Point(11, 336)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(76, 31)
        Me.Label7.TabIndex = 45
        Me.Label7.Text = "Date"
        '
        'datePicker
        '
        Me.datePicker.Location = New System.Drawing.Point(225, 335)
        Me.datePicker.MinimumSize = New System.Drawing.Size(185, 40)
        Me.datePicker.Name = "datePicker"
        Me.datePicker.Size = New System.Drawing.Size(185, 40)
        Me.datePicker.TabIndex = 47
        '
        'cbClassName
        '
        Me.cbClassName.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.cbClassName.FormattingEnabled = True
        Me.cbClassName.Location = New System.Drawing.Point(225, 100)
        Me.cbClassName.MinimumSize = New System.Drawing.Size(33, 0)
        Me.cbClassName.Name = "cbClassName"
        Me.cbClassName.Size = New System.Drawing.Size(185, 39)
        Me.cbClassName.TabIndex = 48
        '
        'cbRoomName
        '
        Me.cbRoomName.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.cbRoomName.FormattingEnabled = True
        Me.cbRoomName.Location = New System.Drawing.Point(225, 145)
        Me.cbRoomName.MinimumSize = New System.Drawing.Size(33, 0)
        Me.cbRoomName.Name = "cbRoomName"
        Me.cbRoomName.Size = New System.Drawing.Size(185, 39)
        Me.cbRoomName.TabIndex = 49
        '
        'cbTeacherName
        '
        Me.cbTeacherName.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.cbTeacherName.FormattingEnabled = True
        Me.cbTeacherName.Location = New System.Drawing.Point(225, 193)
        Me.cbTeacherName.MinimumSize = New System.Drawing.Size(33, 0)
        Me.cbTeacherName.Name = "cbTeacherName"
        Me.cbTeacherName.Size = New System.Drawing.Size(185, 39)
        Me.cbTeacherName.TabIndex = 50
        '
        'Schedule_Add
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.MediumTurquoise
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(429, 473)
        Me.Controls.Add(Me.cbTeacherName)
        Me.Controls.Add(Me.cbRoomName)
        Me.Controls.Add(Me.cbClassName)
        Me.Controls.Add(Me.datePicker)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.txtEnd)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.txtStart)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.btnLschedule)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.btnAdd)
        Me.Name = "Schedule_Add"
        Me.Text = "Schedule_Add"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnLschedule As Button
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents Label3 As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents btnAdd As Button
    Friend WithEvents txtStart As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents txtEnd As TextBox
    Friend WithEvents Label6 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents datePicker As DateTimePicker
    Friend WithEvents cbClassName As ComboBox
    Friend WithEvents cbRoomName As ComboBox
    Friend WithEvents cbTeacherName As ComboBox
End Class
