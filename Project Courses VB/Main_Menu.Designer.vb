<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Main_Menu
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Main_Menu))
        Me.frmClass = New System.Windows.Forms.PictureBox()
        Me.frmSchedule = New System.Windows.Forms.PictureBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.frmTeacher = New System.Windows.Forms.PictureBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.frmStudent = New System.Windows.Forms.PictureBox()
        Me.Label2 = New System.Windows.Forms.Label()
        CType(Me.frmClass, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.frmSchedule, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.frmTeacher, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.frmStudent, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'frmClass
        '
        Me.frmClass.BackColor = System.Drawing.Color.Transparent
        Me.frmClass.BackgroundImage = CType(resources.GetObject("frmClass.BackgroundImage"), System.Drawing.Image)
        Me.frmClass.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.frmClass.Location = New System.Drawing.Point(45, 233)
        Me.frmClass.Name = "frmClass"
        Me.frmClass.Size = New System.Drawing.Size(136, 96)
        Me.frmClass.TabIndex = 2
        Me.frmClass.TabStop = False
        '
        'frmSchedule
        '
        Me.frmSchedule.BackColor = System.Drawing.Color.Transparent
        Me.frmSchedule.BackgroundImage = CType(resources.GetObject("frmSchedule.BackgroundImage"), System.Drawing.Image)
        Me.frmSchedule.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.frmSchedule.Location = New System.Drawing.Point(243, 233)
        Me.frmSchedule.Name = "frmSchedule"
        Me.frmSchedule.Size = New System.Drawing.Size(136, 96)
        Me.frmSchedule.TabIndex = 3
        Me.frmSchedule.TabStop = False
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.Color.Transparent
        Me.Label1.Font = New System.Drawing.Font("Forte", 24.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.Color.White
        Me.Label1.Location = New System.Drawing.Point(108, 32)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(201, 35)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "Main Feature"
        '
        'frmTeacher
        '
        Me.frmTeacher.BackColor = System.Drawing.Color.Transparent
        Me.frmTeacher.BackgroundImage = CType(resources.GetObject("frmTeacher.BackgroundImage"), System.Drawing.Image)
        Me.frmTeacher.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.frmTeacher.Location = New System.Drawing.Point(243, 90)
        Me.frmTeacher.Name = "frmTeacher"
        Me.frmTeacher.Size = New System.Drawing.Size(136, 96)
        Me.frmTeacher.TabIndex = 5
        Me.frmTeacher.TabStop = False
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.BackColor = System.Drawing.Color.Transparent
        Me.Label3.Font = New System.Drawing.Font("Bahnschrift SemiBold Condensed", 18.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(161, Byte))
        Me.Label3.ForeColor = System.Drawing.Color.White
        Me.Label3.Location = New System.Drawing.Point(275, 186)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(75, 29)
        Me.Label3.TabIndex = 7
        Me.Label3.Text = "Teacher"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.BackColor = System.Drawing.Color.Transparent
        Me.Label4.Font = New System.Drawing.Font("Bahnschrift SemiBold Condensed", 18.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(161, Byte))
        Me.Label4.ForeColor = System.Drawing.Color.White
        Me.Label4.Location = New System.Drawing.Point(81, 332)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(57, 29)
        Me.Label4.TabIndex = 8
        Me.Label4.Text = "Class"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.BackColor = System.Drawing.Color.Transparent
        Me.Label5.Font = New System.Drawing.Font("Bahnschrift SemiBold Condensed", 18.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(161, Byte))
        Me.Label5.ForeColor = System.Drawing.Color.White
        Me.Label5.Location = New System.Drawing.Point(273, 332)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(86, 29)
        Me.Label5.TabIndex = 9
        Me.Label5.Text = "Schedule"
        '
        'frmStudent
        '
        Me.frmStudent.BackColor = System.Drawing.Color.Transparent
        Me.frmStudent.BackgroundImage = CType(resources.GetObject("frmStudent.BackgroundImage"), System.Drawing.Image)
        Me.frmStudent.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.frmStudent.Location = New System.Drawing.Point(45, 90)
        Me.frmStudent.Name = "frmStudent"
        Me.frmStudent.Size = New System.Drawing.Size(136, 96)
        Me.frmStudent.TabIndex = 0
        Me.frmStudent.TabStop = False
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.BackColor = System.Drawing.Color.Transparent
        Me.Label2.Font = New System.Drawing.Font("Bahnschrift SemiBold Condensed", 18.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(161, Byte))
        Me.Label2.ForeColor = System.Drawing.Color.White
        Me.Label2.Location = New System.Drawing.Point(78, 187)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(74, 29)
        Me.Label2.TabIndex = 6
        Me.Label2.Text = "Student"
        '
        'Main_Menu
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.RoyalBlue
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(421, 406)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.frmTeacher)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.frmSchedule)
        Me.Controls.Add(Me.frmClass)
        Me.Controls.Add(Me.frmStudent)
        Me.Name = "Main_Menu"
        Me.Text = "Main_Menu"
        CType(Me.frmClass, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.frmSchedule, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.frmTeacher, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.frmStudent, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents frmClass As PictureBox
    Friend WithEvents frmSchedule As PictureBox
    Friend WithEvents Label1 As Label
    Friend WithEvents frmTeacher As PictureBox
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents frmStudent As PictureBox
    Friend WithEvents Label2 As Label
End Class
