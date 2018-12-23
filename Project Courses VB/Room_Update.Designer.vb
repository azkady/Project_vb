<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Room_Update
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
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Room_Update))
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.txtRoomname = New System.Windows.Forms.TextBox()
        Me.txtStudentclass = New System.Windows.Forms.TextBox()
        Me.btnBack = New System.Windows.Forms.Button()
        Me.tnDelete = New System.Windows.Forms.Button()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Button4 = New System.Windows.Forms.Button()
        Me.txtSearch = New System.Windows.Forms.TextBox()
        Me.txtIdclass = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.tableRoom = New System.Windows.Forms.DataGridView()
        Me.btnUpdate = New System.Windows.Forms.Button()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.tableRoom, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'PictureBox1
        '
        Me.PictureBox1.BackColor = System.Drawing.Color.Transparent
        Me.PictureBox1.BackgroundImage = CType(resources.GetObject("PictureBox1.BackgroundImage"), System.Drawing.Image)
        Me.PictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox1.Location = New System.Drawing.Point(565, 314)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(154, 103)
        Me.PictureBox1.TabIndex = 102
        Me.PictureBox1.TabStop = False
        '
        'txtRoomname
        '
        Me.txtRoomname.Enabled = False
        Me.txtRoomname.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtRoomname.Location = New System.Drawing.Point(619, 172)
        Me.txtRoomname.Multiline = True
        Me.txtRoomname.Name = "txtRoomname"
        Me.txtRoomname.Size = New System.Drawing.Size(185, 35)
        Me.txtRoomname.TabIndex = 100
        '
        'txtStudentclass
        '
        Me.txtStudentclass.Enabled = False
        Me.txtStudentclass.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtStudentclass.Location = New System.Drawing.Point(619, 126)
        Me.txtStudentclass.Multiline = True
        Me.txtStudentclass.Name = "txtStudentclass"
        Me.txtStudentclass.Size = New System.Drawing.Size(185, 35)
        Me.txtStudentclass.TabIndex = 99
        '
        'btnBack
        '
        Me.btnBack.Location = New System.Drawing.Point(708, 233)
        Me.btnBack.Name = "btnBack"
        Me.btnBack.Size = New System.Drawing.Size(96, 43)
        Me.btnBack.TabIndex = 98
        Me.btnBack.Text = "Back"
        Me.btnBack.UseVisualStyleBackColor = True
        '
        'btnDelete
        '
        Me.tnDelete.Location = New System.Drawing.Point(579, 233)
        Me.tnDelete.Name = "tnDelete"
        Me.tnDelete.Size = New System.Drawing.Size(96, 43)
        Me.tnDelete.TabIndex = 97
        Me.tnDelete.Text = "Delete"
        Me.tnDelete.UseVisualStyleBackColor = True
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Font = New System.Drawing.Font("Microsoft Sans Serif", 21.75!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.ForeColor = System.Drawing.Color.White
        Me.Label5.Location = New System.Drawing.Point(217, 10)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(341, 33)
        Me.Label5.TabIndex = 96
        Me.Label5.Text = "UPDATE ROOM FORM"
        '
        'Button4
        '
        Me.Button4.Location = New System.Drawing.Point(336, 82)
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
        Me.txtSearch.Location = New System.Drawing.Point(12, 82)
        Me.txtSearch.Multiline = True
        Me.txtSearch.Name = "txtSearch"
        Me.txtSearch.Size = New System.Drawing.Size(309, 32)
        Me.txtSearch.TabIndex = 94
        '
        'txtIdclass
        '
        Me.txtIdclass.Enabled = False
        Me.txtIdclass.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.25!, System.Drawing.FontStyle.Bold)
        Me.txtIdclass.Location = New System.Drawing.Point(619, 82)
        Me.txtIdclass.Multiline = True
        Me.txtIdclass.Name = "txtIdclass"
        Me.txtIdclass.Size = New System.Drawing.Size(185, 35)
        Me.txtIdclass.TabIndex = 93
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label3.ForeColor = System.Drawing.Color.White
        Me.Label3.Location = New System.Drawing.Point(448, 172)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(158, 29)
        Me.Label3.TabIndex = 91
        Me.Label3.Text = "Room Name"
        '
        'tableRoom
        '
        Me.tableRoom.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.tableRoom.Location = New System.Drawing.Point(12, 126)
        Me.tableRoom.Name = "tableRoom"
        Me.tableRoom.Size = New System.Drawing.Size(415, 314)
        Me.tableRoom.TabIndex = 90
        '
        'btnUpdate
        '
        Me.btnUpdate.Location = New System.Drawing.Point(450, 233)
        Me.btnUpdate.Name = "btnUpdate"
        Me.btnUpdate.Size = New System.Drawing.Size(96, 43)
        Me.btnUpdate.TabIndex = 89
        Me.btnUpdate.Text = "Update"
        Me.btnUpdate.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold)
        Me.Label2.ForeColor = System.Drawing.Color.White
        Me.Label2.Location = New System.Drawing.Point(448, 126)
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
        Me.Label1.Location = New System.Drawing.Point(448, 82)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(110, 29)
        Me.Label1.TabIndex = 87
        Me.Label1.Text = "ID Class"
        '
        'Room_Update
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.DarkOrchid
        Me.BackgroundImage = CType(resources.GetObject("$this.BackgroundImage"), System.Drawing.Image)
        Me.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.ClientSize = New System.Drawing.Size(818, 448)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.txtRoomname)
        Me.Controls.Add(Me.txtStudentclass)
        Me.Controls.Add(Me.btnBack)
        Me.Controls.Add(Me.tnDelete)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.txtSearch)
        Me.Controls.Add(Me.txtIdclass)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.tableRoom)
        Me.Controls.Add(Me.btnUpdate)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Room_Update"
        Me.Text = "Room_Update"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.tableRoom, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents txtRoomname As TextBox
    Friend WithEvents txtStudentclass As TextBox
    Friend WithEvents btnBack As Button
    Friend WithEvents tnDelete As Button
    Friend WithEvents Label5 As Label
    Friend WithEvents Button4 As Button
    Friend WithEvents txtSearch As TextBox
    Friend WithEvents txtIdclass As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents tableRoom As DataGridView
    Friend WithEvents btnUpdate As Button
    Friend WithEvents Label2 As Label
    Friend WithEvents Label1 As Label
End Class
