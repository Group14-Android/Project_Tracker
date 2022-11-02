package brian.murphy.g14projecttracker

/*
@Entity(tableName = "project_tbl")
data class ProjectEntity(

    @ColumnInfo(name="title") val title:String?,
    @ColumnInfo(name="summary") val summary:String?,
    @ColumnInfo(name="description") val description:String?,
    @ColumnInfo(name="Tasks") val tasks:String?,
    @ColumnInfo(name="num_remainingTasks") val num_remainingTasks: Number?,
    @ColumnInfo(name="num_totalTasks") val num_totalTasks :Number?,
    @ColumnInfo(name="startDate") val startDate:String?, //= Date(),
    @PrimaryKey(autoGenerate = true) val id:Long=0
)
*/
data class DisplayProject(
    val title:String?,
    val summary:String?,
    val description:String?,
    val tasks:String?,
    val num_remainingTasks: Number?,
    val num_totalTasks :Number?,
    val startDate:String?
):java.io.Serializable
/*
@Entity(tableName = "notes_tbl", foreignKeys = [ForeignKey(
    entity = ProjectEntity::class,
    parentColumns = ["id"],
    childColumns = ["project_id"],
    onDelete = CASCADE
)]
)
data class NotesEntity(

    @ColumnInfo(name="title") val title:String?,
    @ColumnInfo(name="summary") val summary:String?,
    @ColumnInfo(name="description") val description:String?,
    @ColumnInfo(name="startDate") val startDate:String?, //= Date(),
    @ColumnInfo(name="project_id") val project_id: Long?,
    @PrimaryKey(autoGenerate = true) val id:Long=0
)
*/
data class DisplayNotes(
    val title:String?,
    val summary:String?,
    val description:String?,
    val startDate:String?,
    val project_id: Long?
):java.io.Serializable
/*
@Entity(tableName = "resources_tbl",foreignKeys = [ForeignKey(
    entity = ProjectEntity::class,
    parentColumns = ["id"],
    childColumns = ["project_id"],
    onDelete = CASCADE
)])
data class ResourcessEntity(

    @ColumnInfo(name="title") val title:String?,
    @ColumnInfo(name="summary") val summary:String?,
    @ColumnInfo(name="link") val description:String?,
    @ColumnInfo(name="project_id") val project_id: Long?,
    @PrimaryKey(autoGenerate = true) val id:Long=0
)*/
data class DisplayResources(
val title:String?,
val summary:String?,
val description:String?,
val project_id: Long?
):java.io.Serializable