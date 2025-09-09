package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelNipponitesShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer base;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer row;
    private final AdvancedModelRenderer row0;
    private final AdvancedModelRenderer row1;
    private final AdvancedModelRenderer row2;
    private final AdvancedModelRenderer row3;
    private final AdvancedModelRenderer row4;
    private final AdvancedModelRenderer row5;
    private final AdvancedModelRenderer row6;
    private final AdvancedModelRenderer row7;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer row8;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer row9;
    private final AdvancedModelRenderer row10;
    private final AdvancedModelRenderer row11;
    private final AdvancedModelRenderer row12;
    private final AdvancedModelRenderer row13;
    private final AdvancedModelRenderer row14;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer row15;
    private final AdvancedModelRenderer row16;
    private final AdvancedModelRenderer row17;
    private final AdvancedModelRenderer row18;
    private final AdvancedModelRenderer row19;
    private final AdvancedModelRenderer row20;
    private final AdvancedModelRenderer row21;
    private final AdvancedModelRenderer row22;
    private final AdvancedModelRenderer row23;
    private final AdvancedModelRenderer row24;
    private final AdvancedModelRenderer row25;
    private final AdvancedModelRenderer row26;
    private final AdvancedModelRenderer row27;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer arm;
    private final AdvancedModelRenderer armb;
    private final AdvancedModelRenderer armc;
    private final AdvancedModelRenderer arm6;
    private final AdvancedModelRenderer armb6;
    private final AdvancedModelRenderer armc6;
    private final AdvancedModelRenderer arm2;
    private final AdvancedModelRenderer armb2;
    private final AdvancedModelRenderer armc2;
    private final AdvancedModelRenderer arm7;
    private final AdvancedModelRenderer armb7;
    private final AdvancedModelRenderer armc7;
    private final AdvancedModelRenderer arm3;
    private final AdvancedModelRenderer armb3;
    private final AdvancedModelRenderer armc3;
    private final AdvancedModelRenderer arm8;
    private final AdvancedModelRenderer armb8;
    private final AdvancedModelRenderer armc8;
    private final AdvancedModelRenderer arm4;
    private final AdvancedModelRenderer armb4;
    private final AdvancedModelRenderer armc4;
    private final AdvancedModelRenderer arm9;
    private final AdvancedModelRenderer armb9;
    private final AdvancedModelRenderer armc9;
    private final AdvancedModelRenderer arm5;
    private final AdvancedModelRenderer armb5;
    private final AdvancedModelRenderer armc5;
    private final AdvancedModelRenderer arm10;
    private final AdvancedModelRenderer armb10;
    private final AdvancedModelRenderer armc10;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;

    public ModelNipponitesShell() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.base = new AdvancedModelRenderer(this);
        this.base.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.setRotateAngle(base, 0.0F, -0.2618F, 0.1309F);


        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.base.addChild(shell);


        this.row = new AdvancedModelRenderer(this);
        this.row.setRotationPoint(-4.0F, -1.25F, -1.75F);
        this.shell.addChild(row);
        this.setRotateAngle(row, -0.2286F, 0.3343F, -0.2296F);
        this.row.cubeList.add(new ModelBox(row, 24, 13, -4.0F, -5.0F, -1.0F, 5, 5, 6, 0.0F, false));

        this.row0 = new AdvancedModelRenderer(this);
        this.row0.setRotationPoint(-4.0F, 0.0F, 5.0F);
        this.row.addChild(row0);
        this.setRotateAngle(row0, 0.6183F, 0.1382F, 0.1069F);
        this.row0.cubeList.add(new ModelBox(row0, 0, 35, 0.0F, -5.0F, 0.0F, 5, 5, 4, -0.01F, false));

        this.row1 = new AdvancedModelRenderer(this);
        this.row1.setRotationPoint(2.0F, 0.0F, 4.0F);
        this.row0.addChild(row1);
        this.setRotateAngle(row1, 0.3927F, 0.0F, 0.0F);
        this.row1.cubeList.add(new ModelBox(row1, 36, 43, -2.0F, -5.0F, 0.0F, 5, 5, 4, 0.01F, false));

        this.row2 = new AdvancedModelRenderer(this);
        this.row2.setRotationPoint(-4.0F, 0.0F, -1.0F);
        this.row.addChild(row2);
        this.setRotateAngle(row2, 0.0F, -0.6545F, 0.0F);
        this.row2.cubeList.add(new ModelBox(row2, 24, 24, 0.0F, -5.0F, -5.0F, 5, 5, 5, -0.01F, false));

        this.row3 = new AdvancedModelRenderer(this);
        this.row3.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.row2.addChild(row3);
        this.setRotateAngle(row3, 0.0F, -0.7854F, 0.0F);
        this.row3.cubeList.add(new ModelBox(row3, 0, 0, 0.0F, -5.0F, -8.0F, 5, 5, 8, 0.01F, false));

        this.row4 = new AdvancedModelRenderer(this);
        this.row4.setRotationPoint(0.5F, -4.0F, -9.0F);
        this.shell.addChild(row4);
        this.setRotateAngle(row4, -0.1521F, 1.2304F, -0.3678F);
        this.row4.cubeList.add(new ModelBox(row4, 0, 25, -4.0F, -4.0F, 0.0F, 4, 4, 6, 0.0F, false));

        this.row5 = new AdvancedModelRenderer(this);
        this.row5.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.row4.addChild(row5);
        this.setRotateAngle(row5, 0.0F, -1.0908F, 0.0F);
        this.row5.cubeList.add(new ModelBox(row5, 0, 13, -4.0F, -4.0F, 0.0F, 4, 4, 8, 0.01F, false));

        this.row6 = new AdvancedModelRenderer(this);
        this.row6.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.row5.addChild(row6);
        this.setRotateAngle(row6, 0.0F, -0.6981F, 0.0F);
        this.row6.cubeList.add(new ModelBox(row6, 38, 34, -4.0F, -4.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.row7 = new AdvancedModelRenderer(this);
        this.row7.setRotationPoint(4.55F, -4.5F, 6.0F);
        this.shell.addChild(row7);
        this.setRotateAngle(row7, 1.2217F, 0.0436F, 0.0873F);
        this.row7.cubeList.add(new ModelBox(row7, 18, 43, -4.0F, -4.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.0F, 0.0F, 5.0F);
        this.row7.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.8727F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 52, -1.0F, -3.0F, 0.0F, 4, 3, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.0F, -1.8F, 0.0F);
        this.row7.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.3963F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 32, -1.0F, -0.85F, -2.0F, 4, 2, 2, -0.02F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.row7.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.9599F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 32, -1.0F, -4.0F, -2.0F, 4, 4, 2, -0.01F, false));

        this.row8 = new AdvancedModelRenderer(this);
        this.row8.setRotationPoint(5.95F, -9.0F, 1.0F);
        this.shell.addChild(row8);
        this.setRotateAngle(row8, -0.1713F, -0.2393F, 0.3098F);
        this.row8.cubeList.add(new ModelBox(row8, 0, 44, -4.0F, -4.0F, 0.0F, 4, 4, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.0F, -4.0F, 4.0F);
        this.row8.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.6981F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 8, -1.0F, 0.0F, 0.0F, 4, 3, 2, -0.01F, false));

        this.row9 = new AdvancedModelRenderer(this);
        this.row9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.row8.addChild(row9);
        this.setRotateAngle(row9, 0.0F, 0.48F, 0.0F);
        this.row9.cubeList.add(new ModelBox(row9, 20, 34, -4.0F, -4.0F, -5.0F, 4, 4, 5, -0.01F, false));

        this.row10 = new AdvancedModelRenderer(this);
        this.row10.setRotationPoint(5.5F, -13.0F, -3.5F);
        this.shell.addChild(row10);
        this.setRotateAngle(row10, 0.0873F, -0.5236F, -0.0436F);
        this.row10.cubeList.add(new ModelBox(row10, 44, 24, -4.0F, -1.0F, 0.0F, 4, 4, 4, 0.0F, false));

        this.row11 = new AdvancedModelRenderer(this);
        this.row11.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.row10.addChild(row11);
        this.setRotateAngle(row11, 0.0F, 0.6109F, 0.0F);
        this.row11.cubeList.add(new ModelBox(row11, 46, 0, -3.0F, -1.0F, 0.0F, 3, 4, 4, -0.01F, false));

        this.row12 = new AdvancedModelRenderer(this);
        this.row12.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.row11.addChild(row12);
        this.setRotateAngle(row12, 0.0F, 0.9599F, 0.0F);
        this.row12.cubeList.add(new ModelBox(row12, 46, 8, -3.0F, -1.0F, 0.0F, 3, 4, 4, 0.01F, false));

        this.row13 = new AdvancedModelRenderer(this);
        this.row13.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.row12.addChild(row13);
        this.setRotateAngle(row13, 0.0F, 0.5236F, 0.0F);
        this.row13.cubeList.add(new ModelBox(row13, 26, 0, -6.0F, -1.0F, 0.0F, 6, 4, 4, 0.0F, false));

        this.row14 = new AdvancedModelRenderer(this);
        this.row14.setRotationPoint(-0.5F, -14.25F, 5.5F);
        this.shell.addChild(row14);
        this.setRotateAngle(row14, 0.0436F, 0.0873F, -0.1745F);
        this.row14.cubeList.add(new ModelBox(row14, 28, 52, -4.0F, 0.0F, -3.0F, 4, 3, 3, 0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.row14.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.829F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 51, 0.0F, -2.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.row15 = new AdvancedModelRenderer(this);
        this.row15.setRotationPoint(-4.0F, 2.0F, 0.0F);
        this.row14.addChild(row15);
        this.setRotateAngle(row15, 0.0F, -0.9599F, 0.0F);
        this.row15.cubeList.add(new ModelBox(row15, 56, 57, -3.0F, -2.0F, -3.0F, 3, 3, 3, -0.01F, false));

        this.row16 = new AdvancedModelRenderer(this);
        this.row16.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.row15.addChild(row16);
        this.setRotateAngle(row16, 0.0F, -0.7418F, 0.0F);
        this.row16.cubeList.add(new ModelBox(row16, 42, 52, -4.0F, -2.0F, -3.0F, 4, 3, 3, 0.0F, false));

        this.row17 = new AdvancedModelRenderer(this);
        this.row17.setRotationPoint(-3.0F, -13.25F, -0.3F);
        this.shell.addChild(row17);
        this.setRotateAngle(row17, -0.7416F, 0.0772F, 0.0518F);
        this.row17.cubeList.add(new ModelBox(row17, 14, 58, -3.0F, 0.0F, 0.0F, 3, 3, 3, -0.01F, false));

        this.row18 = new AdvancedModelRenderer(this);
        this.row18.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.row17.addChild(row18);
        this.setRotateAngle(row18, 0.829F, 0.0F, 0.0F);
        this.row18.cubeList.add(new ModelBox(row18, 26, 58, -3.0F, 0.0F, 0.0F, 3, 3, 3, 0.01F, false));

        this.row19 = new AdvancedModelRenderer(this);
        this.row19.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.row18.addChild(row19);
        this.setRotateAngle(row19, 1.2654F, 0.0F, 0.0F);
        this.row19.cubeList.add(new ModelBox(row19, 54, 43, -3.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F, false));

        this.row20 = new AdvancedModelRenderer(this);
        this.row20.setRotationPoint(-4.25F, -9.0F, 4.55F);
        this.shell.addChild(row20);
        this.setRotateAngle(row20, 0.3953F, -0.7859F, -0.1457F);
        this.row20.cubeList.add(new ModelBox(row20, 38, 8, -2.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.row21 = new AdvancedModelRenderer(this);
        this.row21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.row20.addChild(row21);
        this.setRotateAngle(row21, 0.0F, 0.7418F, 0.0F);
        this.row21.cubeList.add(new ModelBox(row21, 60, 0, 0.0F, -1.0F, -2.0F, 2, 2, 2, 0.01F, false));

        this.row22 = new AdvancedModelRenderer(this);
        this.row22.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.row21.addChild(row22);
        this.setRotateAngle(row22, 0.0F, 0.7418F, 0.0F);
        this.row22.cubeList.add(new ModelBox(row22, 60, 4, 0.0F, -1.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.row23 = new AdvancedModelRenderer(this);
        this.row23.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.row22.addChild(row23);
        this.setRotateAngle(row23, 0.0F, 0.7418F, 0.0F);
        this.row23.cubeList.add(new ModelBox(row23, 56, 38, 0.0F, -1.0F, -2.0F, 4, 2, 2, -0.01F, false));

        this.row24 = new AdvancedModelRenderer(this);
        this.row24.setRotationPoint(4.0F, 1.0F, -1.0F);
        this.row23.addChild(row24);
        this.setRotateAngle(row24, 0.5328F, -0.7448F, -0.983F);
        this.row24.cubeList.add(new ModelBox(row24, 44, 32, 0.0F, -1.0F, -0.5F, 3, 1, 1, 0.0F, false));

        this.row25 = new AdvancedModelRenderer(this);
        this.row25.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.row24.addChild(row25);
        this.setRotateAngle(row25, 0.0F, 0.0F, -0.9599F);
        this.row25.cubeList.add(new ModelBox(row25, 50, 61, 0.0F, -1.0F, -0.5F, 2, 1, 1, 0.01F, false));

        this.row26 = new AdvancedModelRenderer(this);
        this.row26.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.row25.addChild(row26);
        this.setRotateAngle(row26, 0.0F, 0.0F, -1.0472F);
        this.row26.cubeList.add(new ModelBox(row26, 44, 64, 0.0F, -1.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.row27 = new AdvancedModelRenderer(this);
        this.row27.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.row26.addChild(row27);
        this.setRotateAngle(row27, 0.48F, -0.3491F, -0.6109F);
        this.row27.cubeList.add(new ModelBox(row27, 50, 58, 0.0F, -3.0F, 0.0F, 3, 3, 0, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-2.95F, -10.0F, 7.45F);
        this.base.addChild(body);
        this.setRotateAngle(body, -0.4363F, 0.5236F, -0.1745F);
        this.body.cubeList.add(new ModelBox(body, 38, 58, -2.0F, 0.0F, 2.0F, 4, 4, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.48F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 46, 16, -2.0F, 0.0F, -3.0F, 4, 4, 3, 0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.body2.addChild(body3);
        this.setRotateAngle(body3, 0.829F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 52, -2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F, false));

        this.arm = new AdvancedModelRenderer(this);
        this.arm.setRotationPoint(-0.5F, 0.5F, 4.0F);
        this.body.addChild(arm);
        this.setRotateAngle(arm, 0.0873F, 0.0F, -0.0873F);
        this.arm.cubeList.add(new ModelBox(arm, 60, 12, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.armb = new AdvancedModelRenderer(this);
        this.armb.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm.addChild(armb);
        this.setRotateAngle(armb, -0.0873F, 0.0F, 0.0F);
        this.armb.cubeList.add(new ModelBox(armb, 60, 16, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armc = new AdvancedModelRenderer(this);
        this.armc.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb.addChild(armc);
        this.setRotateAngle(armc, -0.1309F, 0.0F, 0.0F);
        this.armc.cubeList.add(new ModelBox(armc, 60, 20, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.arm6 = new AdvancedModelRenderer(this);
        this.arm6.setRotationPoint(0.5F, 0.5F, 4.0F);
        this.body.addChild(arm6);
        this.setRotateAngle(arm6, 0.0873F, 0.0F, 0.0873F);
        this.arm6.cubeList.add(new ModelBox(arm6, 60, 12, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.armb6 = new AdvancedModelRenderer(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm6.addChild(armb6);
        this.setRotateAngle(armb6, -0.0873F, 0.0F, 0.0F);
        this.armb6.cubeList.add(new ModelBox(armb6, 60, 16, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armc6 = new AdvancedModelRenderer(this);
        this.armc6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb6.addChild(armc6);
        this.setRotateAngle(armc6, -0.1309F, 0.0F, 0.0F);
        this.armc6.cubeList.add(new ModelBox(armc6, 60, 20, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.arm2 = new AdvancedModelRenderer(this);
        this.arm2.setRotationPoint(-1.25F, 0.85F, 4.0F);
        this.body.addChild(arm2);
        this.setRotateAngle(arm2, 0.0873F, 0.0F, -0.7418F);
        this.arm2.cubeList.add(new ModelBox(arm2, 60, 24, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.armb2 = new AdvancedModelRenderer(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm2.addChild(armb2);
        this.setRotateAngle(armb2, -0.0873F, 0.0F, 0.0F);
        this.armb2.cubeList.add(new ModelBox(armb2, 60, 28, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armc2 = new AdvancedModelRenderer(this);
        this.armc2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb2.addChild(armc2);
        this.setRotateAngle(armc2, -0.1309F, 0.0F, 0.0F);
        this.armc2.cubeList.add(new ModelBox(armc2, 50, 63, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.arm7 = new AdvancedModelRenderer(this);
        this.arm7.setRotationPoint(1.25F, 0.85F, 4.0F);
        this.body.addChild(arm7);
        this.setRotateAngle(arm7, 0.0873F, 0.0F, 0.7418F);
        this.arm7.cubeList.add(new ModelBox(arm7, 60, 24, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.armb7 = new AdvancedModelRenderer(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm7.addChild(armb7);
        this.setRotateAngle(armb7, -0.0873F, 0.0F, 0.0F);
        this.armb7.cubeList.add(new ModelBox(armb7, 60, 28, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armc7 = new AdvancedModelRenderer(this);
        this.armc7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb7.addChild(armc7);
        this.setRotateAngle(armc7, -0.1309F, 0.0F, 0.0F);
        this.armc7.cubeList.add(new ModelBox(armc7, 50, 63, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.arm3 = new AdvancedModelRenderer(this);
        this.arm3.setRotationPoint(-1.5F, 1.75F, 4.0F);
        this.body.addChild(arm3);
        this.setRotateAngle(arm3, 0.0873F, 0.0F, -1.5708F);
        this.arm3.cubeList.add(new ModelBox(arm3, 58, 63, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.armb3 = new AdvancedModelRenderer(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm3.addChild(armb3);
        this.setRotateAngle(armb3, -0.0873F, 0.0F, 0.0F);
        this.armb3.cubeList.add(new ModelBox(armb3, 12, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armc3 = new AdvancedModelRenderer(this);
        this.armc3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb3.addChild(armc3);
        this.setRotateAngle(armc3, -0.1309F, 0.0F, 0.0F);
        this.armc3.cubeList.add(new ModelBox(armc3, 20, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.arm8 = new AdvancedModelRenderer(this);
        this.arm8.setRotationPoint(1.5F, 1.75F, 4.0F);
        this.body.addChild(arm8);
        this.setRotateAngle(arm8, 0.0873F, 0.0F, 1.5708F);
        this.arm8.cubeList.add(new ModelBox(arm8, 58, 63, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.armb8 = new AdvancedModelRenderer(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm8.addChild(armb8);
        this.setRotateAngle(armb8, -0.0873F, 0.0F, 0.0F);
        this.armb8.cubeList.add(new ModelBox(armb8, 12, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armc8 = new AdvancedModelRenderer(this);
        this.armc8.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb8.addChild(armc8);
        this.setRotateAngle(armc8, -0.1309F, 0.0F, 0.0F);
        this.armc8.cubeList.add(new ModelBox(armc8, 20, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.arm4 = new AdvancedModelRenderer(this);
        this.arm4.setRotationPoint(-1.3F, 2.75F, 4.0F);
        this.body.addChild(arm4);
        this.setRotateAngle(arm4, 0.0873F, 0.0F, -2.1817F);
        this.arm4.cubeList.add(new ModelBox(arm4, 28, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.armb4 = new AdvancedModelRenderer(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm4.addChild(armb4);
        this.setRotateAngle(armb4, -0.0873F, 0.0F, 0.0F);
        this.armb4.cubeList.add(new ModelBox(armb4, 36, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armc4 = new AdvancedModelRenderer(this);
        this.armc4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb4.addChild(armc4);
        this.setRotateAngle(armc4, -0.1309F, 0.0F, 0.0F);
        this.armc4.cubeList.add(new ModelBox(armc4, 0, 65, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.arm9 = new AdvancedModelRenderer(this);
        this.arm9.setRotationPoint(1.3F, 2.75F, 4.0F);
        this.body.addChild(arm9);
        this.setRotateAngle(arm9, 0.0873F, 0.0F, 2.1817F);
        this.arm9.cubeList.add(new ModelBox(arm9, 28, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.armb9 = new AdvancedModelRenderer(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm9.addChild(armb9);
        this.setRotateAngle(armb9, -0.0873F, 0.0F, 0.0F);
        this.armb9.cubeList.add(new ModelBox(armb9, 36, 64, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armc9 = new AdvancedModelRenderer(this);
        this.armc9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb9.addChild(armc9);
        this.setRotateAngle(armc9, -0.1309F, 0.0F, 0.0F);
        this.armc9.cubeList.add(new ModelBox(armc9, 0, 65, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.arm5 = new AdvancedModelRenderer(this);
        this.arm5.setRotationPoint(-0.75F, 3.5F, 4.0F);
        this.body.addChild(arm5);
        this.setRotateAngle(arm5, 0.0873F, 0.0F, -2.7925F);
        this.arm5.cubeList.add(new ModelBox(arm5, 66, 42, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.armb5 = new AdvancedModelRenderer(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm5.addChild(armb5);
        this.setRotateAngle(armb5, -0.0873F, 0.0F, 0.0F);
        this.armb5.cubeList.add(new ModelBox(armb5, 66, 46, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, false));

        this.armc5 = new AdvancedModelRenderer(this);
        this.armc5.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb5.addChild(armc5);
        this.setRotateAngle(armc5, -0.1309F, 0.0F, 0.0F);
        this.armc5.cubeList.add(new ModelBox(armc5, 66, 63, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.arm10 = new AdvancedModelRenderer(this);
        this.arm10.setRotationPoint(0.75F, 3.5F, 4.0F);
        this.body.addChild(arm10);
        this.setRotateAngle(arm10, 0.0873F, 0.0F, 2.7925F);
        this.arm10.cubeList.add(new ModelBox(arm10, 66, 42, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.armb10 = new AdvancedModelRenderer(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.arm10.addChild(armb10);
        this.setRotateAngle(armb10, -0.0873F, 0.0F, 0.0F);
        this.armb10.cubeList.add(new ModelBox(armb10, 66, 46, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.01F, true));

        this.armc10 = new AdvancedModelRenderer(this);
        this.armc10.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.armb10.addChild(armc10);
        this.setRotateAngle(armc10, -0.1309F, 0.0F, 0.0F);
        this.armc10.cubeList.add(new ModelBox(armc10, 66, 63, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, true));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.body.addChild(siphon);
        this.setRotateAngle(siphon, -0.2618F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 0, 59, -0.5F, -1.15F, 0.0F, 1, 1, 5, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.body.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.2618F, 0.0F, 0.48F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 60, 8, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));
        this.eyeright.cubeList.add(new ModelBox(eyeright, 20, 25, -1.1F, 0.5F, -1.5F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.body.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.2618F, 0.0F, -0.48F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 60, 8, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, true));
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 20, 25, 0.1F, 0.5F, -1.5F, 1, 1, 1, 0.0F, true));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.base.offsetY = -1.2F;
        this.base.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
