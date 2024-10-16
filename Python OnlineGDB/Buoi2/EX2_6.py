import json

def save_json(data, filename):
    with open(filename, 'w') as json_file:
        json.dump(data, json_file, indent=4)
    print(f"Data has been saved to {filename}.")

def read_json(filename):
    with open(filename, 'r') as json_file:
        data = json.load(json_file)
    print(f"Data has been loaded from {filename}.")
    return data