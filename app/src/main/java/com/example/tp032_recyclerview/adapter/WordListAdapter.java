package com.example.tp032_recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tp032_recyclerview.R;
import com.example.tp032_recyclerview.model.Word;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>
{
    private final LinkedList<Word> mWordList;

    public WordListAdapter(LinkedList<Word> mWordList) {
        this.mWordList = mWordList;
    }

    /**
     * Créer de nouvelles vues
     * (appelé par le gestionnaire de disposition "LayoutManager")
     */
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // créer une nouvelle vue
        View adapterLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.wordlist_item, parent, false);

        return new WordViewHolder(adapterLayout, this);
    }

    /**
     * Remplacer le contenu d'une vue
     * (appelé par le gestionnaire de disposition "LayoutManager")
     */
    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        Word mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent.getWord());
    }

    /**
     * Renvoyer la taille de votre ensemble de données
     * (appelé par le gestionnaire de disposition "LayoutManager")
     */
    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder {
        public final TextView wordItemView;
        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word_title);
            this.mAdapter = adapter;
        }
    }
}