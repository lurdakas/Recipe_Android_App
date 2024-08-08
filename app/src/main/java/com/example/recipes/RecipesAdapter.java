package com.example.recipes;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class RecipesAdapter extends ArrayAdapter<Recipes> {

    public RecipesAdapter(Context context, ArrayList<Recipes> recipes) {
        super(context, 0, recipes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Recipes recipe = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_recipes, parent, false);
        }
// Lookup view for data population
        TextView textViewTitle = convertView.findViewById(R.id.textViewTitle);
        TextView textViewDescription = convertView.findViewById(R.id.textViewDescription);
        TextView textViewInstructions = convertView.findViewById(R.id.textViewInstructions);
        TextView textViewPrepTime = convertView.findViewById(R.id.textViewPrepTime);
        TextView textViewCookTime = convertView.findViewById(R.id.textViewCookTime);
        TextView textViewServings = convertView.findViewById(R.id.textViewServings);

// Populate the data into the template view using the data object
        textViewTitle.setText(recipe.getTitle());
        textViewDescription.setText(recipe.getDescription());
        textViewInstructions.setText(recipe.getInstructions());
        textViewPrepTime.setText(String.valueOf(recipe.getPrepTime()) + " min");
        textViewCookTime.setText(String.valueOf(recipe.getCookTime()) + " min");
        textViewServings.setText(String.valueOf(recipe.getServings()) + " servings");

        return convertView;
    }
}
