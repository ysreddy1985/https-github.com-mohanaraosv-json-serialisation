

@JsonProperty - customize name of the element instead having class name

@JsonIgnoreProperties should be on Builder to prevent "unknown property" errors.

@JsonDeserialize 

	using=MySerializer.class
	as=MyHashMap.class,
	keyAs=MyHashKey.class,
	contentAs=MyHashValue.class
	












JSON - Ignore
--------------

@JsonIgnoreProperties annotation ignored the field userId and gender both during serialization and deserialization.

@JsonIgnore - marks a field in a POJO to be ignored by Jackson during serialization and deserialization. Jackson ignores the field in both JSON serialization and deserialization. An example of Java class that uses the @JsonIgnore annotation is this

@JsonIgnoreProperties annotation is used at the class level to ignore fields during serialization and deserialization. The properties that are declared in this annotation will not be mapped to the JSON content

@JsonIgnoreType annotation is used to mark a class to be ignored during serialization and deserialization. It marks all the properties of the class to be ignored while generating and reading JSON. An example of Java class that uses the @JsonIgnoreType annotation is this


@JsonAutoDetect :is used at the class level to tell Jackson to override the visibility of the properties of a class during serialization and deserialization. You can set the visibility with the following elements:

creatorVisibility
fieldVisibility
getterVisibility
setterVisibility
isGetterVisibility

-> JsonAutoDetect class defines public static constants that are similar to Java class visibility levels. They are:

	ANY
	DEFAULT
	NON_PRIVATE
	NONE
	PROTECTED_AND_PRIVATE
	PUBLIC_ONLY
	
Jackson serialization annotations 
---------------------------------

@JsonValue - To map the value instead of getter method.

@JsonInclude - 

@JsonGetter - 

@JsonAnyGetter

@JsonPropertyOrder - To control the order of the json elements

@JsonRawValue - To accept json value as string. 

@JsonSerialize - To register custom serialize logic. (like Custom mapping ex : Date, LocalDate, LocalDateTime)

@JsonRootName - To control the name of the root element instead of class name. 

