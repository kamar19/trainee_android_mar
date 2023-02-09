enum class Command(val value: String) {
    START("/start"), END("/end"), HELP("/help"), RETURN("/return"), PARK_INFO_BY_CAR("/park_info_by_car"),
    PARK_INFO_BY_PLACE("/park_info_by_place"), PARK("/park"), PARK_STATS("/park_stats"), PARK_ALL_STATS("/park_all_stats")
}

