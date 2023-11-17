# TP 03.2: RecyclerView

The RecyclerView application demonstrates how to use a RecyclerView to display a long list of scrolling words. You create the dataset (the words), the RecyclerView itself, and define the actions that the user can perform:

- Touching a word marks it as clicked.
- Touching the Floating Action Button (FAB) adds a new word.

-----------------------------------------------------------------------------------------------------------------
# Summary

RecyclerView is an efficient way to display a scrolling list of items. Here are key points to understand about RecyclerView:

1. **Efficient List Display:**
   - RecyclerView efficiently displays a scrolling list of elements.

2. **Adapter and Layout:**
   - To create a view for each list item, the adapter inflates an XML layout resource for a list item using `LayoutInflater`.

3. **LayoutManager:**
   - `LinearLayoutManager` is a RecyclerView layout manager that displays items in a vertically or horizontally scrolling list.
   - `GridLayoutManager` is a RecyclerView layout manager that displays items in a grid.
   - `StaggeredGridLayoutManager` is a RecyclerView layout manager that displays items in a staggered grid.

4. **Connecting Data:**
   - Use `RecyclerView.Adapter` to connect your data to the RecyclerView.
   - It prepares the data in a `RecyclerView.ViewHolder`, which describes a View item and its position in the RecyclerView.

5. **Item Clicks:**
   - Implement `View.OnClickListener` to detect mouse clicks in a RecyclerView.

Understanding these concepts will help you effectively implement RecyclerView in your Android applications.

------------------------------------------------------------------------------------------------------------------

# Learn More

Here are additional resources to enhance your understanding of Android development and RecyclerView:

### Android Studio Documentation:
- [Android Studio User Guide](https://developer.android.com/studio/intro)
- [Create app icons with Image Asset Studio](https://developer.android.com/studio/write/image-asset-studio)

### Android Developer Documentation:
- [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview)
- [LayoutInflater](https://developer.android.com/reference/android/view/LayoutInflater)
- [RecyclerView.LayoutManager](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView.LayoutManager)
- [LinearLayoutManager](https://developer.android.com/reference/androidx/recyclerview/widget/LinearLayoutManager)
- [GridLayoutManager](https://developer.android.com/reference/androidx/recyclerview/widget/GridLayoutManager)
- [StaggeredGridLayoutManager](https://developer.android.com/reference/androidx/recyclerview/widget/StaggeredGridLayoutManager)
- [CoordinatorLayout](https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout)
- [ConstraintLayout](https://developer.android.com/training/constraint-layout)
- [RecyclerView.Adapter](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView.Adapter)
- [RecyclerView.ViewHolder](https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView.ViewHolder)
- [View.OnClickListener](https://developer.android.com/reference/android/view/View.OnClickListener)
- [Create a list with RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview)

### Video:
- [RecyclerView Animations and Behind the Scenes (Android Dev Summit 2015)](https://www.youtube.com/watch?v=LqBlYJTfLP4)

Explore these resources to deepen your knowledge and gain insights into various aspects of Android development, especially related to RecyclerView and UI layout management.
