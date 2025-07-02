A binary tree system meant to emulate Skyrim's perk system. This is an exercise I wrote from scratch that showcases knowledge of the following OO concepts:
- OO design (creating objects to store data, util classes, etc.)
- binary trees (PerkTree is a binary tree)
- Hashes (the initial perks are housed in a HashMap for easier searching/initializing for each tree)
- recursion (the tree's search and insert functions operate on recursion to iterate through the binary tree)

How To Run:

Update Log:
1.0 - Initial version, includes perks and right/left branching perks. Also has constants and overall perk tree design to use binary trees and searching.

Future Features:
- reading perk names and descriptions from a NoSQL database instead of hard-coding
- "levels" to several perks
- tracking what perks a user currently has
- add/remove perks from a tree
- Custom PerkException to return an empty/error perk and log it using log4j