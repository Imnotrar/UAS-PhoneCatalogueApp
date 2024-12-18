package kelompok.tiga.phonecatalogapp.data

import kelompok.tiga.phonecatalogapp.R
import kelompok.tiga.phonecatalogapp.model.Phone
import kelompok.tiga.phonecatalogapp.model.PhoneSpecs

object PhoneDataSource {
    val phones = listOf(
        Phone(
            idPhone = 1,
            name = R.string.iphone_15_name,
            type = "iPhone",
            image = R.drawable.iphone15ijo,
            images = listOf(
                R.drawable.iphone15ijo,
                R.drawable.iphone15pink,
                R.drawable.iphone15campur
            ),
            isNew = true,
            specs = PhoneSpecs(
                launch = R.string.iphone_15_launch,
                processor = R.string.iphone_15_processor,
                ram = R.string.iphone_15_ram,
                storage = R.string.iphone_15_storage,
                camera = R.string.iphone_15_camera,
                battery = R.string.iphone_15_battery,
                display = R.string.iphone_15_display,
                os = R.string.iphone_15_os,
                features = R.string.iphone_15_features
            )
        ),
        Phone(
            idPhone = 2,
            name = R.string.iphone_14_name,
            type = "iPhone",
            image = R.drawable.iphone14prog,
            images = listOf(
                R.drawable.iphone14prog,
                R.drawable.iphone14pros,
                R.drawable.iphone14procampur
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.iphone_14_launch,
                processor = R.string.iphone_14_launch,
                ram = R.string.iphone_14_ram,
                storage = R.string.iphone_14_storage,
                camera = R.string.iphone_14_camera,
                battery = R.string.iphone_14_battery,
                display = R.string.iphone_14_display,
                os = R.string.iphone_14_os,
                features = R.string.iphone_14_features
            )
        ),
        Phone(
            idPhone = 3,
            name = R.string.iphone_14_name,
            type = "iPhone",
            image = R.drawable.ip14b,
            images = listOf(
                R.drawable.ip14b,
                R.drawable.ip14c,
                R.drawable.ip14u
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.iphone_14_launch,
                processor = R.string.iphone_14_processor,
                ram = R.string.iphone_14_ram,
                storage = R.string.iphone_14_storage,
                camera = R.string.iphone_14_camera,
                battery = R.string.iphone_14_battery,
                display = R.string.iphone_14_display,
                os = R.string.iphone_14_os,
                features = R.string.iphone_14_features
            )
        ),
        Phone(
            idPhone = 4,
            name = R.string.iphone_13_pro_max_name,
            type = "iPhone",
            image = R.drawable.ip13progl,
            images = listOf(
                R.drawable.ip13progl,
                R.drawable.ip13pros,
                R.drawable.ip13proc
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.iphone_13_pro_max_launch,
                processor = R.string.iphone_13_pro_max_processor,
                ram = R.string.iphone_13_pro_max_ram,
                storage = R.string.iphone_13_pro_max_storage,
                camera = R.string.iphone_13_pro_max_camera,
                battery = R.string.iphone_13_pro_max_battery,
                display = R.string.iphone_13_pro_max_display,
                os = R.string.iphone_13_pro_max_os,
                features = R.string.iphone_13_pro_max_features
            )
        ),
        Phone(
            idPhone = 5,
            name = R.string.iphone_13_name,
            type = "iPhone",
            image = R.drawable.ip13p,
            images = listOf(
                R.drawable.ip13p,
                R.drawable.ip13r,
                R.drawable.ip13c
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.iphone_13_launch,
                processor = R.string.iphone_13_processor,
                ram = R.string.iphone_13_ram,
                storage = R.string.iphone_13_storage,
                camera = R.string.iphone_13_camera,
                battery = R.string.iphone_13_battery,
                display = R.string.iphone_13_display,
                os = R.string.iphone_13_os,
                features = R.string.iphone_13_features
            )
        ),
        Phone(
            idPhone = 6,
            name = R.string.iphone_12_pro_max_name,
            type = "iPhone",
            image = R.drawable.ip12w,
            images = listOf(
                R.drawable.ip12w,
                R.drawable.ip12gl
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.iphone_12_pro_max_launch,
                processor = R.string.iphone_12_pro_max_processor,
                ram = R.string.iphone_12_pro_max_ram,
                storage = R.string.iphone_12_pro_max_storage,
                camera = R.string.iphone_12_pro_max_camera,
                battery = R.string.iphone_12_pro_max_battery,
                display = R.string.iphone_12_pro_max_display,
                os = R.string.iphone_12_pro_max_os,
                features = R.string.iphone_12_pro_max_features
            )
        ),
        Phone(
            idPhone = 8,
            name = R.string.iphone_se_3_name,
            type = "iPhone",
            image = R.drawable.seb,
            images = listOf(
                R.drawable.seb,
                R.drawable.sew,
                R.drawable.sec
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.iphone_se_3_launch,
                processor = R.string.iphone_se_3_processor,
                ram = R.string.iphone_se_3_ram,
                storage = R.string.iphone_se_3_storage,
                camera = R.string.iphone_se_3_camera,
                battery = R.string.iphone_se_3_battery,
                display = R.string.iphone_se_3_display,
                os = R.string.iphone_se_3_os,
                features = R.string.iphone_se_3_features
            )
        ),
        Phone(
            idPhone = 1,
            name = R.string.samsung_s23_name,
            type = "Samsung",
            image = R.drawable.s23g,
            images = listOf(
                R.drawable.s23g,
                R.drawable.s23pu,
                R.drawable.s23c
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.samsung_s23_launch,
                processor = R.string.samsung_s23_processor,
                ram = R.string.samsung_s23_ram,
                storage = R.string.samsung_s23_storage,
                camera = R.string.samsung_s23_camera,
                battery = R.string.samsung_s23_battery,
                display = R.string.samsung_s23_display,
                os = R.string.samsung_s23_os,
                features = R.string.samsung_s23_features
            )
        ),
        Phone(
            idPhone = 2,
            name = R.string.samsung_zfold5_name,
            type = "Samsung",
            image = R.drawable.zfb,
            images = listOf(
                R.drawable.zfb,
                R.drawable.zfc1,
                R.drawable.zfoldcampur
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.samsung_zfold5_launch,
                processor = R.string.samsung_zfold5_processor,
                ram = R.string.samsung_zfold5_ram,
                storage = R.string.samsung_zfold5_storage,
                camera = R.string.samsung_zfold5_camera,
                battery = R.string.samsung_zfold5_battery,
                display = R.string.samsung_zfold5_display,
                os = R.string.samsung_zfold5_os,
                features = R.string.samsung_zfold5_features
            )
        ),
        Phone(
            idPhone = 3,
            name = R.string.samsung_zflip5_name,
            type = "Samsung",
            image = R.drawable.zflipungu, // Replace with actual image resource
            images = listOf(
                R.drawable.zflipungu,
                R.drawable.zflipijo,
                R.drawable.zflipcampur
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.samsung_zflip5_launch,
                processor = R.string.samsung_zflip5_processor,
                ram = R.string.samsung_zflip5_ram,
                storage = R.string.samsung_zflip5_storage,
                camera = R.string.samsung_zflip5_camera,
                battery = R.string.samsung_zflip5_battery,
                display = R.string.samsung_zflip5_display,
                os = R.string.samsung_zflip5_os,
                features = R.string.samsung_zflip5_features
            )
        ),
        Phone(
            idPhone = 4,
            name = R.string.samsung_a54_name,
            type = "Samsung",
            image = R.drawable.a54lime, // Replace with actual image resource
            images = listOf(
                R.drawable.a54hitam,
                R.drawable.a54purple,
                R.drawable.a54campur
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.samsung_a54_launch,
                processor = R.string.samsung_a54_processor,
                ram = R.string.samsung_a54_ram,
                storage = R.string.samsung_a54_storage,
                camera = R.string.samsung_a54_camera,
                battery = R.string.samsung_a54_battery,
                display = R.string.samsung_a54_display,
                os = R.string.samsung_a54_os,
                features = R.string.samsung_a54_features
            )
        ),
        Phone(
            idPhone = 5,
            name = R.string.samsung_a35_name,
            type = "Samsung",
            image = R.drawable.a35lilac, // Replace with actual image resource
            images = listOf(
                R.drawable.a35lilac,
                R.drawable.a35campur
            ),
            isNew = true,
            specs = PhoneSpecs(
                launch = R.string.samsung_a35_launch,
                processor = R.string.samsung_a35_processor,
                ram = R.string.samsung_a35_ram,
                storage = R.string.samsung_a35_storage,
                camera = R.string.samsung_a35_camera,
                battery = R.string.samsung_a35_battery,
                display = R.string.samsung_a35_display,
                os = R.string.samsung_a35_os,
                features = R.string.samsung_a35_features
            )
        ),
        Phone(
            idPhone = 6,
            name = R.string.samsung_m14_name,
            type = "Samsung",
            image = R.drawable.m14ijo, // Replace with actual image resource
            images = listOf(
                R.drawable.m14ijo,
                R.drawable.m14white,
                R.drawable.m14campur
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.samsung_m14_launch,
                processor = R.string.samsung_m14_processor,
                ram = R.string.samsung_m14_ram,
                storage = R.string.samsung_m14_storage,
                camera = R.string.samsung_m14_camera,
                battery = R.string.samsung_m14_battery,
                display = R.string.samsung_m14_display,
                os = R.string.samsung_m14_os,
                features = R.string.samsung_m14_features
            )
        ),
        Phone(
            idPhone = 7,
            name = R.string.samsung_s24ultra_name,
            type = "Samsung",
            image = R.drawable.s24ug,
            images = listOf(
                R.drawable.s24ug,
                R.drawable.s24ugl,
                R.drawable.s24c
            ),
            isNew = true,
            specs = PhoneSpecs(
                launch = R.string.samsung_s24ultra_launch,
                processor = R.string.samsung_s24ultra_processor,
                ram = R.string.samsung_s24ultra_ram,
                storage = R.string.samsung_s24ultra_storage,
                camera = R.string.samsung_s24ultra_camera,
                battery = R.string.samsung_s24ultra_battery,
                display = R.string.samsung_s24ultra_display,
                os = R.string.samsung_s24ultra_os,
                features = R.string.samsung_s24ultra_features
            )
        ),
        Phone(
            idPhone = 21,
            name = R.string.phone_name_x6_pro,
            type = "Oppo",
            image = R.drawable.x6prob,
            images = listOf(
                R.drawable.x6prog,
                R.drawable.x6problack,
                R.drawable.x6procampur
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_x6_pro,
                processor = R.string.phone_processor_x6_pro,
                ram = R.string.phone_ram_x6_pro,
                storage = R.string.phone_storage_x6_pro,
                camera = R.string.phone_camera_x6_pro,
                battery = R.string.phone_battery_x6_pro,
                display = R.string.phone_display_x6_pro,
                os = R.string.phone_os_x6_pro,
                features = R.string.phone_features_x6_pro
            )
        ),
        Phone(
            idPhone = 23,
            name = R.string.phone_name_reno_10_pro_plus,
            type = "Oppo",
            image = R.drawable.r10pro,
            images = listOf(
                R.drawable.r10pro,
                R.drawable.r10campur
            ),
            isNew = true,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_reno_10_pro_plus,
                processor = R.string.phone_processor_reno_10_pro_plus,
                ram = R.string.phone_ram_reno_10_pro_plus,
                storage = R.string.phone_storage_reno_10_pro_plus,
                camera = R.string.phone_camera_reno_10_pro_plus,
                battery = R.string.phone_battery_reno_10_pro_plus,
                display = R.string.phone_display_reno_10_pro_plus,
                os = R.string.phone_os_reno_10_pro_plus,
                features = R.string.phone_features_reno_10_pro_plus
            )
        ),
        Phone(
            idPhone = 26,
            name = R.string.phone_name_a98_5g,
            type = "Oppo",
            image = R.drawable.a98black,
            images = listOf(
                R.drawable.a98black,
                R.drawable.a98campur
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_a98_5g,
                processor = R.string.phone_processor_a98_5g,
                ram = R.string.phone_ram_a98_5g,
                storage = R.string.phone_storage_a98_5g,
                camera = R.string.phone_camera_a98_5g,
                battery = R.string.phone_battery_a98_5g,
                display = R.string.phone_display_a98_5g,
                os = R.string.phone_os_a98_5g,
                features = R.string.phone_features_a98_5g
            )
        ),
        Phone(
            idPhone = 27,
            name = R.string.phone_name_a78_5g,
            type = "Oppo",
            image = R.drawable.a78ungu,
            images = listOf(
                R.drawable.a78ungu,
                R.drawable.a78
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_a78_5g,
                processor = R.string.phone_processor_a78_5g,
                ram = R.string.phone_ram_a78_5g,
                storage = R.string.phone_storage_a78_5g,
                camera = R.string.phone_camera_a78_5g,
                battery = R.string.phone_battery_a78_5g,
                display = R.string.phone_display_a78_5g,
                os = R.string.phone_os_a78_5g,
                features = R.string.phone_features_a78_5g
            )
        ),
        Phone(
            idPhone = 29,
            name = R.string.phone_name_f21_pro_5g,
            type = "Oppo",
            image = R.drawable.f1rainbow,
            images = listOf(
                R.drawable.f1rainbow,
                R.drawable.f1black,
                R.drawable.f21
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_f21_pro_5g,
                processor = R.string.phone_processor_f21_pro_5g,
                ram = R.string.phone_ram_f21_pro_5g,
                storage = R.string.phone_storage_f21_pro_5g,
                camera = R.string.phone_camera_f21_pro_5g,
                battery = R.string.phone_battery_f21_pro_5g,
                display = R.string.phone_display_f21_pro_5g,
                os = R.string.phone_os_f21_pro_5g,
                features = R.string.phone_features_f21_pro_5g
            )
        ),
        Phone(
            idPhone = 30,
            name = R.string.phone_name_a58,
            type = "Oppo",
            image = R.drawable.a54b,
            images = listOf(
                R.drawable.a54oo,
                R.drawable.a58
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_a58,
                processor = R.string.phone_processor_a58,
                ram = R.string.phone_ram_a58,
                storage = R.string.phone_storage_a58,
                camera = R.string.phone_camera_a58,
                battery = R.string.phone_battery_a58,
                display = R.string.phone_display_a58,
                os = R.string.phone_os_a58,
                features = R.string.phone_features_a58
            )
        ),
        Phone(
            idPhone = 41,
            name = R.string.phone_name_x13_pro,
            type = "Oppo",
            image = R.drawable.x13prog,
            images = listOf(
                R.drawable.x13prog,
                R.drawable.x13pro
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_x13_pro,
                processor = R.string.phone_processor_x13_pro,
                ram = R.string.phone_ram_x13_pro,
                storage = R.string.phone_storage_x13_pro,
                camera = R.string.phone_camera_x13_pro,
                battery = R.string.phone_battery_x13_pro,
                display = R.string.phone_display_x13_pro,
                os = R.string.phone_os_x13_pro,
                features = R.string.phone_features_x13_pro
            )
        ),
        Phone(
            idPhone = 44,
            name = R.string.phone_name_x12t_pro,
            type = "Xiaomi",
            image = R.drawable.x12tpro,
            images = listOf(
                R.drawable.x12tpro,
                R.drawable.x12tprob,
                R.drawable.x12tproc
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_x12t_pro,
                processor = R.string.phone_processor_x12t_pro,
                ram = R.string.phone_ram_x12t_pro,
                storage = R.string.phone_storage_x12t_pro,
                camera = R.string.phone_camera_x12t_pro,
                battery = R.string.phone_battery_x12t_pro,
                display = R.string.phone_display_x12t_pro,
                os = R.string.phone_os_x12t_pro,
                features = R.string.phone_features_x12t_pro
            )
        ),
        Phone(
            idPhone = 46,
            name = R.string.phone_name_note13_pro_plus,
            type = "Xiaomi",
            image = R.drawable.note13cream,
            images = listOf(
                R.drawable.note13cream,
                R.drawable.note13black,
                R.drawable.note13white
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_note13_pro_plus,
                processor = R.string.phone_processor_note13_pro_plus,
                ram = R.string.phone_ram_note13_pro_plus,
                storage = R.string.phone_storage_note13_pro_plus,
                camera = R.string.phone_camera_note13_pro_plus,
                battery = R.string.phone_battery_note13_pro_plus,
                display = R.string.phone_display_note13_pro_plus,
                os = R.string.phone_os_note13_pro_plus,
                features = R.string.phone_features_note13_pro_plus
            )
        ),
        Phone(
            idPhone = 49,
            name = R.string.phone_name_poco_f5_pro,
            type = "Xiaomi",
            image = R.drawable.pocof51,
            images = listOf(
                R.drawable.pocof51,
                R.drawable.pocof52
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_poco_f5_pro,
                processor = R.string.phone_processor_poco_f5_pro,
                ram = R.string.phone_ram_poco_f5_pro,
                storage = R.string.phone_storage_poco_f5_pro,
                camera = R.string.phone_camera_poco_f5_pro,
                battery = R.string.phone_battery_poco_f5_pro,
                display = R.string.phone_display_poco_f5_pro,
                os = R.string.phone_os_poco_f5_pro,
                features = R.string.phone_features_poco_f5_pro
            )
        ),
        Phone(
            idPhone = 50,
            name = R.string.phone_name_poco_x5_pro,
            type = "Xiaomi",
            image = R.drawable.pocox5gold,
            images = listOf(
                R.drawable.pocox5gold,
                R.drawable.pocox5b,
                R.drawable.pocox5black
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_poco_x5_pro,
                processor = R.string.phone_processor_poco_x5_pro,
                ram = R.string.phone_ram_poco_x5_pro,
                storage = R.string.phone_storage_poco_x5_pro,
                camera = R.string.phone_camera_poco_x5_pro,
                battery = R.string.phone_battery_poco_x5_pro,
                display = R.string.phone_display_poco_x5_pro,
                os = R.string.phone_os_poco_x5_pro,
                features = R.string.phone_features_poco_x5_pro
            )
        ),
        Phone(
            idPhone = 1,
            name = R.string.phone_name_mate_50_pro,
            type = "Huawei",
            image = R.drawable.mate50pro1,
            images = listOf(
                R.drawable.mate50pro1
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_mate_50_pro,
                processor = R.string.phone_processor_mate_50_pro,
                ram = R.string.phone_ram_mate_50_pro,
                storage = R.string.phone_storage_mate_50_pro,
                camera = R.string.phone_camera_mate_50_pro,
                battery = R.string.phone_battery_mate_50_pro,
                display = R.string.phone_display_mate_50_pro,
                os = R.string.phone_os_mate_50_pro,
                features = R.string.phone_features_mate_50_pro
            )
        ),

        Phone(
            idPhone = 2,
            name = R.string.phone_name_mate_60_pro,
            type = "Huawei",
            image = R.drawable.mate601,
            images = listOf(
                R.drawable.mate601,
                R.drawable.mate602
            ),
            isNew = true,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_mate_60_pro,
                processor = R.string.phone_processor_mate_60_pro,
                ram = R.string.phone_ram_mate_60_pro,
                storage = R.string.phone_storage_mate_60_pro,
                camera = R.string.phone_camera_mate_60_pro,
                battery = R.string.phone_battery_mate_60_pro,
                display = R.string.phone_display_mate_60_pro,
                os = R.string.phone_os_mate_60_pro,
                features = R.string.phone_features_mate_60_pro
            )
        ),

        Phone(
            idPhone = 3,
            name = R.string.phone_name_p50_pro,
            type = "Huawei",
            image = R.drawable.p501,
            images = listOf(
                R.drawable.p501,
                R.drawable.p502
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_p50_pro,
                processor = R.string.phone_processor_p50_pro,
                ram = R.string.phone_ram_p50_pro,
                storage = R.string.phone_storage_p50_pro,
                camera = R.string.phone_camera_p50_pro,
                battery = R.string.phone_battery_p50_pro,
                display = R.string.phone_display_p50_pro,
                os = R.string.phone_os_p50_pro,
                features = R.string.phone_features_p50_pro
            )
        ),

        Phone(
            idPhone = 4,
            name = R.string.phone_name_nova_11_pro,
            type = "Huawei",
            image = R.drawable.nova11,
            images = listOf(
                R.drawable.nova11,
                R.drawable.nova11c
            ),
            isNew = true,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_nova_11_pro,
                processor = R.string.phone_processor_nova_11_pro,
                ram = R.string.phone_ram_nova_11_pro,
                storage = R.string.phone_storage_nova_11_pro,
                camera = R.string.phone_camera_nova_11_pro,
                battery = R.string.phone_battery_nova_11_pro,
                display = R.string.phone_display_nova_11_pro,
                os = R.string.phone_os_nova_11_pro,
                features = R.string.phone_features_nova_11_pro
            )
        ),

        Phone(
            idPhone = 5,
            name = R.string.phone_name_nova_10_pro,
            type = "Huawei",
            image = R.drawable.nova10p,
            images = listOf(
                R.drawable.nova10p,
                R.drawable.nova102,
                R.drawable.nova103
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_nova_10_pro,
                processor = R.string.phone_processor_nova_10_pro,
                ram = R.string.phone_ram_nova_10_pro,
                storage = R.string.phone_storage_nova_10_pro,
                camera = R.string.phone_camera_nova_10_pro,
                battery = R.string.phone_battery_nova_10_pro,
                display = R.string.phone_display_nova_10_pro,
                os = R.string.phone_os_nova_10_pro,
                features = R.string.phone_features_nova_10_pro
            )
        ),

        Phone(
            idPhone = 6,
            name = R.string.phone_name_y9a,
            type = "Huawei",
            image = R.drawable.y9a,
            images = listOf(
                R.drawable.y9a,
                R.drawable.y9ab
            ),
            isNew = false,
            specs = PhoneSpecs(
                launch = R.string.phone_launch_y9a,
                processor = R.string.phone_processor_y9a,
                ram = R.string.phone_ram_y9a,
                storage = R.string.phone_storage_y9a,
                camera = R.string.phone_camera_y9a,
                battery = R.string.phone_battery_y9a,
                display = R.string.phone_display_y9a,
                os = R.string.phone_os_y9a,
                features = R.string.phone_features_y9a
            )
        )

    )
}