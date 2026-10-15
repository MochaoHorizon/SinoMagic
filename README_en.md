# SinoMagic

*「七月流火，九月授衣，春日载阳，有鸣仓庚」*

[English](README_en.md) | [简体中文](README.md)

**中华魔法** — a **Minecraft 1.21.1 (NeoForge)** mod about traditional Chinese food culture, built on top of **Farmer's Delight**.

> **Status: early development.** The mod builds and runs — items, blocks, crops, world generation, the millstone machine and the jukebox songs are all implemented. Textures and translations are still being filled in.

## Scope

- The soybean chain: soybean → pod → edamame → soybean powder → soy milk → tofu → fermented / stinky / baked / dried tofu → latiao
- Seasoning and liquids: salt ore → salt → marinade → soy sauce → soybean oil
- **Millstone** machine block for grinding ingredients into powders (GeckoLib-animated)
- Crops and world generation: soybean, chili, salt ore and their wild variants
- Recipes for the vanilla table, Farmer's Delight's cooking pot and cutting board, plus optional **Create** processing
- Chinese replacement tracks for vanilla background music, plus 20 jukebox songs

## Requirements

| Component | Version |
|---|---|
| Minecraft | 1.21.1 |
| NeoForge | 21.1.219 or newer |
| Java | 21 |
| Farmer's Delight | 1.3.2 or newer — required at runtime |
| GeckoLib | 4.8.3 or newer — required at runtime |
| Create | 6.0.10 or newer — optional |

## Building

```sh
./gradlew build        # -> build/libs/sinomagic-0.1.2.jar
./gradlew runClient    # launch a dev client with the mod loaded
./gradlew runData      # regenerate item models and recipes
```

Open the folder in IntelliJ IDEA as a Gradle project to get code completion for Minecraft and NeoForge classes.

## Mod metadata

| | |
|---|---|
| Display name | SinoMagic (中文名：中华魔法) |
| Mod ID | `sinomagic` |
| Package | `com.mochaohorizon.sinomagic` |
| Artifact | `sinomagic-0.1.2.jar` |

## Credits

- 一只带明球 (DMHR114514)
- 荧惑启明 (ExTetragon)
- 克劳德 (Cloud1232534)
- 之一

## License

MIT — see [LICENSE](LICENSE).
