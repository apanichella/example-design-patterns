# Problem description

We want to develop an **Editor** that displays textual documents using GUI. The look of the Editor should *change depending on the context*, such as the length of the text, the theme (background color and text color) of the editor, if the text contains chapters, as so on.

By default, the editor has *no scroll bars* because we might not always need them (scroll-bars not always apply). We also want to be able to change the *theme*, add bookmarks, and so on. 


Let's use the **decorator** pattern to implement this scenario. 
