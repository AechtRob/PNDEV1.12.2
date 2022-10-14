package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelIsotelus extends AdvancedModelBase {
    private final AdvancedModelRenderer Isotelus;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer IMMOVABLE;
    private final AdvancedModelRenderer IMMOVABLE2;
    private final AdvancedModelRenderer IMMOVABLE3;
    private final AdvancedModelRenderer IMMOVABLE4;
    private final AdvancedModelRenderer IMMOVABLE5;
    private final AdvancedModelRenderer IMMOVABLE6;
    private final AdvancedModelRenderer AnntenaeL;
    private final AdvancedModelRenderer AnntenaeR;
    private final AdvancedModelRenderer LegRight1;
    private final AdvancedModelRenderer LegLeft1;
    private final AdvancedModelRenderer LegRight2;
    private final AdvancedModelRenderer LegLeft2;
    private final AdvancedModelRenderer LegRight3;
    private final AdvancedModelRenderer LegLeft3;
    private final AdvancedModelRenderer Thorax1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer LegRight4;
    private final AdvancedModelRenderer LegLeft4;
    private final AdvancedModelRenderer Thorax2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer LegRight5;
    private final AdvancedModelRenderer LegLeft5;
    private final AdvancedModelRenderer Thorax3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer LegRight6;
    private final AdvancedModelRenderer LegLeft6;
    private final AdvancedModelRenderer Thorax4;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer LegRight7;
    private final AdvancedModelRenderer LegLeft7;
    private final AdvancedModelRenderer Thorax5;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer LegRight8;
    private final AdvancedModelRenderer LegLeft8;
    private final AdvancedModelRenderer Pygidium;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer IMMOVABLE9;
    private final AdvancedModelRenderer IMMOVABLE10;
    private final AdvancedModelRenderer IMMOVABLE11;
    private final AdvancedModelRenderer IMMOVABLE7;
    private final AdvancedModelRenderer IMMOVABLE8;
    private final AdvancedModelRenderer IMMOVALBE;
    private final AdvancedModelRenderer LegRight9;
    private final AdvancedModelRenderer LegLeft9;
    private final AdvancedModelRenderer LegRight10;
    private final AdvancedModelRenderer LegLeft10;
    private final AdvancedModelRenderer LegRight11;
    private final AdvancedModelRenderer LegLeft11;

    public ModelIsotelus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Isotelus = new AdvancedModelRenderer(this);
        this.Isotelus.setRotationPoint(0.0F, 22.0F, -6.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Isotelus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 11, -4.5F, -0.5F, -4.5F, 9, 1, 3, -0.01F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 24, -2.5F, -0.75F, -7.0F, 5, 2, 7, 0.0F, false));

        this.IMMOVABLE = new AdvancedModelRenderer(this);
        this.IMMOVABLE.setRotationPoint(1.0F, 0.1F, -8.0F);
        this.Isotelus.addChild(IMMOVABLE);
        this.setRotateAngle(IMMOVABLE, 0.0436F, 0.0F, 0.0873F);
        this.IMMOVABLE.cubeList.add(new ModelBox(IMMOVABLE, 0, 0, -1.0F, 0.0F, 0.0F, 8, 1, 10, 0.0F, false));
        this.IMMOVABLE.cubeList.add(new ModelBox(IMMOVABLE, 0, 17, 6.0F, 0.0F, 6.7F, 1, 1, 1, -0.02F, false));

        this.IMMOVABLE2 = new AdvancedModelRenderer(this);
        this.IMMOVABLE2.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.IMMOVABLE.addChild(IMMOVABLE2);
        this.setRotateAngle(IMMOVABLE2, 0.0F, -0.5236F, 0.0F);
        this.IMMOVABLE2.cubeList.add(new ModelBox(IMMOVABLE2, 40, 23, 0.0F, -2.0F, 0.0F, 5, 1, 2, -0.01F, false));

        this.IMMOVABLE3 = new AdvancedModelRenderer(this);
        this.IMMOVABLE3.setRotationPoint(5.0F, 0.0F, 0.0F);
        this.IMMOVABLE2.addChild(IMMOVABLE3);
        this.setRotateAngle(IMMOVABLE3, 0.0F, -0.48F, 0.0F);
        this.IMMOVABLE3.cubeList.add(new ModelBox(IMMOVABLE3, 40, 18, 0.0F, -2.0F, 0.0F, 5, 1, 2, -0.01F, false));

        this.IMMOVABLE4 = new AdvancedModelRenderer(this);
        this.IMMOVABLE4.setRotationPoint(-1.0F, 0.1F, -8.0F);
        this.Isotelus.addChild(IMMOVABLE4);
        this.setRotateAngle(IMMOVABLE4, 0.0436F, 0.0F, -0.0873F);
        this.IMMOVABLE4.cubeList.add(new ModelBox(IMMOVABLE4, 0, 0, -7.0F, 0.0F, 0.0F, 8, 1, 10, 0.0F, true));
        this.IMMOVABLE4.cubeList.add(new ModelBox(IMMOVABLE4, 0, 17, -7.0F, 0.0F, 6.7F, 1, 1, 1, -0.02F, true));

        this.IMMOVABLE5 = new AdvancedModelRenderer(this);
        this.IMMOVABLE5.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.IMMOVABLE4.addChild(IMMOVABLE5);
        this.setRotateAngle(IMMOVABLE5, 0.0F, 0.5236F, 0.0F);
        this.IMMOVABLE5.cubeList.add(new ModelBox(IMMOVABLE5, 40, 23, -5.0F, -2.0F, 0.0F, 5, 1, 2, -0.01F, true));

        this.IMMOVABLE6 = new AdvancedModelRenderer(this);
        this.IMMOVABLE6.setRotationPoint(-5.0F, 0.0F, 0.0F);
        this.IMMOVABLE5.addChild(IMMOVABLE6);
        this.setRotateAngle(IMMOVABLE6, 0.0F, 0.48F, 0.0F);
        this.IMMOVABLE6.cubeList.add(new ModelBox(IMMOVABLE6, 40, 18, -5.0F, -2.0F, 0.0F, 5, 1, 2, -0.01F, true));

        this.AnntenaeL = new AdvancedModelRenderer(this);
        this.AnntenaeL.setRotationPoint(2.0F, 1.0F, -6.75F);
        this.Isotelus.addChild(AnntenaeL);
        this.setRotateAngle(AnntenaeL, 0.0F, -0.7854F, 0.0F);
        this.AnntenaeL.cubeList.add(new ModelBox(AnntenaeL, 18, 0, 0.0F, 0.0F, -8.0F, 10, 0, 8, 0.0F, true));

        this.AnntenaeR = new AdvancedModelRenderer(this);
        this.AnntenaeR.setRotationPoint(-2.0F, 1.0F, -6.75F);
        this.Isotelus.addChild(AnntenaeR);
        this.setRotateAngle(AnntenaeR, 0.0F, 0.7854F, 0.0F);
        this.AnntenaeR.cubeList.add(new ModelBox(AnntenaeR, 18, 0, -10.0F, 0.0F, -8.0F, 10, 0, 8, 0.0F, false));

        this.LegRight1 = new AdvancedModelRenderer(this);
        this.LegRight1.setRotationPoint(-2.0F, 1.45F, -4.5F);
        this.Isotelus.addChild(LegRight1);
        this.setRotateAngle(LegRight1, 0.0F, 0.0F, -0.0873F);
        this.LegRight1.cubeList.add(new ModelBox(LegRight1, 25, 8, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.LegLeft1 = new AdvancedModelRenderer(this);
        this.LegLeft1.setRotationPoint(2.0F, 1.45F, -4.5F);
        this.Isotelus.addChild(LegLeft1);
        this.setRotateAngle(LegLeft1, 0.0F, 0.0F, 0.0873F);
        this.LegLeft1.cubeList.add(new ModelBox(LegLeft1, 25, 8, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.LegRight2 = new AdvancedModelRenderer(this);
        this.LegRight2.setRotationPoint(-2.0F, 1.35F, -2.5F);
        this.Isotelus.addChild(LegRight2);
        this.setRotateAngle(LegRight2, 0.0F, 0.0F, -0.0873F);
        this.LegRight2.cubeList.add(new ModelBox(LegRight2, 22, 23, -6.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.LegLeft2 = new AdvancedModelRenderer(this);
        this.LegLeft2.setRotationPoint(2.0F, 1.35F, -2.5F);
        this.Isotelus.addChild(LegLeft2);
        this.setRotateAngle(LegLeft2, 0.0F, 0.0F, 0.0873F);
        this.LegLeft2.cubeList.add(new ModelBox(LegLeft2, 22, 23, 0.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, true));

        this.LegRight3 = new AdvancedModelRenderer(this);
        this.LegRight3.setRotationPoint(-2.0F, 1.35F, -0.5F);
        this.Isotelus.addChild(LegRight3);
        this.setRotateAngle(LegRight3, 0.0F, 0.0F, -0.0873F);
        this.LegRight3.cubeList.add(new ModelBox(LegRight3, 22, 23, -6.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.LegLeft3 = new AdvancedModelRenderer(this);
        this.LegLeft3.setRotationPoint(2.0F, 1.35F, -0.5F);
        this.Isotelus.addChild(LegLeft3);
        this.setRotateAngle(LegLeft3, 0.0F, 0.0F, 0.0873F);
        this.LegLeft3.cubeList.add(new ModelBox(LegLeft3, 22, 23, 0.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, true));

        this.Thorax1 = new AdvancedModelRenderer(this);
        this.Thorax1.setRotationPoint(0.0F, 0.35F, 0.0F);
        this.Isotelus.addChild(Thorax1);
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 18, 36, -4.0F, -0.25F, 0.0F, 8, 1, 2, 0.0F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 40, 15, -3.5F, -0.25F, -1.0F, 7, 1, 2, -0.01F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 0, 14, -1.5F, -0.75F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Thorax1.cubeList.add(new ModelBox(Thorax1, 45, 31, -2.5F, 0.0F, 0.0F, 5, 1, 2, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, -0.25F, 1.0F);
        this.Thorax1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 15, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.5F, -0.25F, 1.0F);
        this.Thorax1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 15, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));

        this.LegRight4 = new AdvancedModelRenderer(this);
        this.LegRight4.setRotationPoint(-2.0F, 1.0F, 1.5F);
        this.Thorax1.addChild(LegRight4);
        this.setRotateAngle(LegRight4, 0.0F, 0.0F, -0.0873F);
        this.LegRight4.cubeList.add(new ModelBox(LegRight4, 22, 23, -6.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.LegLeft4 = new AdvancedModelRenderer(this);
        this.LegLeft4.setRotationPoint(2.0F, 1.0F, 1.5F);
        this.Thorax1.addChild(LegLeft4);
        this.setRotateAngle(LegLeft4, 0.0F, 0.0F, 0.0873F);
        this.LegLeft4.cubeList.add(new ModelBox(LegLeft4, 22, 23, 0.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, true));

        this.Thorax2 = new AdvancedModelRenderer(this);
        this.Thorax2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax1.addChild(Thorax2);
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 36, 8, -4.0F, -0.25F, 0.0F, 8, 1, 2, -0.001F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 0, 40, -3.5F, -0.25F, -1.0F, 7, 1, 2, -0.01F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 0, 11, -1.5F, -0.75F, 0.0F, 3, 1, 2, -0.001F, false));
        this.Thorax2.cubeList.add(new ModelBox(Thorax2, 12, 45, -2.5F, 0.0F, 0.0F, 5, 1, 2, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-3.5F, -0.2F, 1.0F);
        this.Thorax2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.1745F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 18, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.5F, -0.2F, 1.0F);
        this.Thorax2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.1745F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 18, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));

        this.LegRight5 = new AdvancedModelRenderer(this);
        this.LegRight5.setRotationPoint(-2.0F, 1.0F, 1.5F);
        this.Thorax2.addChild(LegRight5);
        this.setRotateAngle(LegRight5, 0.0F, 0.0F, -0.0873F);
        this.LegRight5.cubeList.add(new ModelBox(LegRight5, 22, 23, -6.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.LegLeft5 = new AdvancedModelRenderer(this);
        this.LegLeft5.setRotationPoint(2.0F, 1.0F, 1.5F);
        this.Thorax2.addChild(LegLeft5);
        this.setRotateAngle(LegLeft5, 0.0F, 0.0F, 0.0873F);
        this.LegLeft5.cubeList.add(new ModelBox(LegLeft5, 22, 23, 0.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, true));

        this.Thorax3 = new AdvancedModelRenderer(this);
        this.Thorax3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax2.addChild(Thorax3);
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 0, 34, -4.0F, -0.25F, 0.0F, 8, 1, 2, -0.002F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 16, 39, -3.5F, -0.25F, -1.0F, 7, 1, 2, -0.01F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 0, 6, -1.5F, -0.75F, 0.0F, 3, 1, 2, -0.002F, false));
        this.Thorax3.cubeList.add(new ModelBox(Thorax3, 38, 43, -2.5F, 0.0F, 0.0F, 5, 1, 2, -0.003F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.5F, -0.15F, 1.0F);
        this.Thorax3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.1745F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 31, 40, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.5F, -0.15F, 1.0F);
        this.Thorax3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.1745F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 40, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));

        this.LegRight6 = new AdvancedModelRenderer(this);
        this.LegRight6.setRotationPoint(-2.0F, 1.0F, 1.5F);
        this.Thorax3.addChild(LegRight6);
        this.setRotateAngle(LegRight6, 0.0F, 0.0F, -0.0873F);
        this.LegRight6.cubeList.add(new ModelBox(LegRight6, 22, 23, -6.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.LegLeft6 = new AdvancedModelRenderer(this);
        this.LegLeft6.setRotationPoint(2.0F, 1.0F, 1.5F);
        this.Thorax3.addChild(LegLeft6);
        this.setRotateAngle(LegLeft6, 0.0F, 0.0F, 0.0873F);
        this.LegLeft6.cubeList.add(new ModelBox(LegLeft6, 22, 23, 0.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, true));

        this.Thorax4 = new AdvancedModelRenderer(this);
        this.Thorax4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax3.addChild(Thorax4);
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 18, 33, -4.0F, -0.25F, 0.0F, 8, 1, 2, -0.003F, false));
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 36, 37, -3.5F, -0.25F, -1.0F, 7, 1, 2, -0.01F, false));
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 0, 3, -1.5F, -0.75F, 0.0F, 3, 1, 2, -0.003F, false));
        this.Thorax4.cubeList.add(new ModelBox(Thorax4, 24, 43, -2.5F, 0.0F, 0.0F, 5, 1, 2, -0.004F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-3.5F, -0.1F, 1.0F);
        this.Thorax4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.1745F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 39, 40, -4.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.5F, -0.1F, 1.0F);
        this.Thorax4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.1745F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 40, 0.0F, 0.0F, -2.0F, 4, 0, 3, 0.0F, false));

        this.LegRight7 = new AdvancedModelRenderer(this);
        this.LegRight7.setRotationPoint(-2.0F, 1.0F, 1.5F);
        this.Thorax4.addChild(LegRight7);
        this.setRotateAngle(LegRight7, 0.0F, 0.0F, -0.0873F);
        this.LegRight7.cubeList.add(new ModelBox(LegRight7, 22, 23, -6.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.LegLeft7 = new AdvancedModelRenderer(this);
        this.LegLeft7.setRotationPoint(2.0F, 1.0F, 1.5F);
        this.Thorax4.addChild(LegLeft7);
        this.setRotateAngle(LegLeft7, 0.0F, 0.0F, 0.0873F);
        this.LegLeft7.cubeList.add(new ModelBox(LegLeft7, 22, 23, 0.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, true));

        this.Thorax5 = new AdvancedModelRenderer(this);
        this.Thorax5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Thorax4.addChild(Thorax5);
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 0, 31, -4.0F, -0.25F, 0.0F, 8, 1, 2, -0.004F, false));
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 0, 37, -3.5F, -0.25F, -1.0F, 7, 1, 2, -0.01F, false));
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 0, 0, -1.5F, -0.75F, 0.0F, 3, 1, 2, -0.004F, false));
        this.Thorax5.cubeList.add(new ModelBox(Thorax5, 0, 43, -2.5F, 0.0F, 0.0F, 5, 1, 2, -0.005F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-3.5F, -0.1F, 1.0F);
        this.Thorax5.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.1745F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 42, -4.0F, 0.05F, -2.0F, 4, 0, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(3.5F, -0.1F, 1.0F);
        this.Thorax5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.1745F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 42, 0.0F, 0.05F, -2.0F, 4, 0, 3, 0.0F, false));

        this.LegRight8 = new AdvancedModelRenderer(this);
        this.LegRight8.setRotationPoint(-2.0F, 1.0F, 1.5F);
        this.Thorax5.addChild(LegRight8);
        this.setRotateAngle(LegRight8, 0.0F, 0.0F, -0.0873F);
        this.LegRight8.cubeList.add(new ModelBox(LegRight8, 22, 23, -6.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.LegLeft8 = new AdvancedModelRenderer(this);
        this.LegLeft8.setRotationPoint(2.0F, 1.0F, 1.5F);
        this.Thorax5.addChild(LegLeft8);
        this.setRotateAngle(LegLeft8, 0.0F, 0.0F, 0.0873F);
        this.LegLeft8.cubeList.add(new ModelBox(LegLeft8, 22, 23, 0.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, true));

        this.Pygidium = new AdvancedModelRenderer(this);
        this.Pygidium.setRotationPoint(0.0F, -0.1F, 2.0F);
        this.Thorax5.addChild(Pygidium);
        this.Pygidium.cubeList.add(new ModelBox(Pygidium, 36, 34, -3.5F, -0.15F, -1.0F, 7, 1, 2, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.5F, 0.0F, -1.0F);
        this.Pygidium.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.1745F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 42, -4.0F, 0.1F, 0.0F, 4, 0, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.5F, 0.0F, -1.0F);
        this.Pygidium.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, 0.1745F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 42, 0.0F, 0.1F, 0.0F, 4, 0, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.25F, 0.0F);
        this.Pygidium.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0349F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 22, -4.0F, -0.5F, 0.0F, 8, 2, 7, 0.0F, false));

        this.IMMOVABLE9 = new AdvancedModelRenderer(this);
        this.IMMOVABLE9.setRotationPoint(-0.1F, 0.65F, 7.0F);
        this.Pygidium.addChild(IMMOVABLE9);
        this.setRotateAngle(IMMOVABLE9, -0.0436F, 0.0F, 0.0873F);
        this.IMMOVABLE9.cubeList.add(new ModelBox(IMMOVABLE9, 0, 11, 0.0F, -1.0F, -7.0F, 8, 1, 10, 0.0F, false));
        this.IMMOVABLE9.cubeList.add(new ModelBox(IMMOVABLE9, 4, 17, 7.0F, -1.0F, -4.75F, 1, 1, 1, -0.02F, false));

        this.IMMOVABLE10 = new AdvancedModelRenderer(this);
        this.IMMOVABLE10.setRotationPoint(1.9F, 1.0F, 2.55F);
        this.IMMOVABLE9.addChild(IMMOVABLE10);
        this.setRotateAngle(IMMOVABLE10, 0.0F, -1.0908F, 0.0F);
        this.IMMOVABLE10.cubeList.add(new ModelBox(IMMOVABLE10, 40, 26, -2.0F, -2.0F, -3.0F, 2, 1, 4, -0.01F, false));

        this.IMMOVABLE11 = new AdvancedModelRenderer(this);
        this.IMMOVABLE11.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.IMMOVABLE10.addChild(IMMOVABLE11);
        this.setRotateAngle(IMMOVABLE11, 0.0F, 0.48F, 0.0F);
        this.IMMOVABLE11.cubeList.add(new ModelBox(IMMOVABLE11, 30, 16, -2.0F, -2.0F, -6.0F, 2, 1, 6, -0.01F, false));

        this.IMMOVABLE7 = new AdvancedModelRenderer(this);
        this.IMMOVABLE7.setRotationPoint(0.1F, 0.65F, 7.0F);
        this.Pygidium.addChild(IMMOVABLE7);
        this.setRotateAngle(IMMOVABLE7, -0.0436F, 0.0F, -0.0873F);
        this.IMMOVABLE7.cubeList.add(new ModelBox(IMMOVABLE7, 0, 11, -8.0F, -1.0F, -7.0F, 8, 1, 10, 0.0F, true));
        this.IMMOVABLE7.cubeList.add(new ModelBox(IMMOVABLE7, 4, 17, -8.0F, -1.0F, -4.75F, 1, 1, 1, -0.02F, true));

        this.IMMOVABLE8 = new AdvancedModelRenderer(this);
        this.IMMOVABLE8.setRotationPoint(-1.9F, 1.0F, 2.55F);
        this.IMMOVABLE7.addChild(IMMOVABLE8);
        this.setRotateAngle(IMMOVABLE8, 0.0F, 1.0908F, 0.0F);
        this.IMMOVABLE8.cubeList.add(new ModelBox(IMMOVABLE8, 40, 26, 0.0F, -2.0F, -3.0F, 2, 1, 4, -0.01F, true));

        this.IMMOVALBE = new AdvancedModelRenderer(this);
        this.IMMOVALBE.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.IMMOVABLE8.addChild(IMMOVALBE);
        this.setRotateAngle(IMMOVALBE, 0.0F, -0.48F, 0.0F);
        this.IMMOVALBE.cubeList.add(new ModelBox(IMMOVALBE, 30, 16, 0.0F, -2.0F, -6.0F, 2, 1, 6, -0.01F, true));

        this.LegRight9 = new AdvancedModelRenderer(this);
        this.LegRight9.setRotationPoint(-2.0F, 1.3F, 1.5F);
        this.Pygidium.addChild(LegRight9);
        this.setRotateAngle(LegRight9, 0.0F, 0.0F, -0.0873F);
        this.LegRight9.cubeList.add(new ModelBox(LegRight9, 25, 8, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.LegLeft9 = new AdvancedModelRenderer(this);
        this.LegLeft9.setRotationPoint(2.0F, 1.3F, 1.5F);
        this.Pygidium.addChild(LegLeft9);
        this.setRotateAngle(LegLeft9, 0.0F, 0.0F, 0.0873F);
        this.LegLeft9.cubeList.add(new ModelBox(LegLeft9, 25, 8, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.LegRight10 = new AdvancedModelRenderer(this);
        this.LegRight10.setRotationPoint(-2.0F, 1.35F, 3.5F);
        this.Pygidium.addChild(LegRight10);
        this.setRotateAngle(LegRight10, 0.0F, 0.0F, -0.0873F);
        this.LegRight10.cubeList.add(new ModelBox(LegRight10, 25, 8, -5.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.LegLeft10 = new AdvancedModelRenderer(this);
        this.LegLeft10.setRotationPoint(2.0F, 1.35F, 3.5F);
        this.Pygidium.addChild(LegLeft10);
        this.setRotateAngle(LegLeft10, 0.0F, 0.0F, 0.0873F);
        this.LegLeft10.cubeList.add(new ModelBox(LegLeft10, 25, 8, 0.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.LegRight11 = new AdvancedModelRenderer(this);
        this.LegRight11.setRotationPoint(-2.0F, 1.45F, 5.5F);
        this.Pygidium.addChild(LegRight11);
        this.setRotateAngle(LegRight11, 0.0F, 0.0F, -0.0873F);
        this.LegRight11.cubeList.add(new ModelBox(LegRight11, 0, 9, -4.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.LegLeft11 = new AdvancedModelRenderer(this);
        this.LegLeft11.setRotationPoint(2.0F, 1.45F, 5.5F);
        this.Pygidium.addChild(LegLeft11);
        this.setRotateAngle(LegLeft11, 0.0F, 0.0F, 0.0873F);
        this.LegLeft11.cubeList.add(new ModelBox(LegLeft11, 0, 9, 0.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Isotelus.render(f5 * 0.55F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Isotelus.offsetZ = 0.03F;
        this.Isotelus.render(0.037F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Isotelus.offsetY = 0.65F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.LegLeft1, this.LegLeft2, this.LegLeft3, this.LegLeft4, this.LegLeft5, this.LegLeft6, this.LegLeft7, this.LegLeft8, this.LegLeft9, this.LegLeft10, this.LegLeft11};
        AdvancedModelRenderer[] legsR = {this.LegRight1, this.LegRight2, this.LegRight3, this.LegRight4, this.LegRight5, this.LegRight6, this.LegRight7, this.LegRight8, this.LegRight9, this.LegRight10, this.LegRight11};
        AdvancedModelRenderer[] bodyF = {this.Thorax1, this.Thorax2, this.Thorax3, this.Thorax4, this.Thorax5, this.Pygidium};

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(LegLeft1, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.flap(LegRight1, 0.5F, 0.5F, true, 0, 0.5F, f2, 0.3F);
            this.flap(LegLeft2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight2, 0.5F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight3, 0.5F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight4, 0.5F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft5, 0.5F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight5, 0.5F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft6, 0.5F, -0.5F, true, 5.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight6, 0.5F, 0.5F, true, 5.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft7, 0.5F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight7, 0.5F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft8, 0.5F, -0.5F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight8, 0.5F, 0.5F, true, 7.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft9, 0.5F, -0.5F, true, 8.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight9, 0.5F, 0.5F, true, 8.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft10, 0.5F, -0.5F, true, 9.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight10, 0.5F, 0.5F, true, 9.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft11, 0.5F, -0.5F, true, 10.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight11, 0.5F, 0.5F, true, 10.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.1F, 0.1F, -3, f2, 1.0F);
            this.chainWave(bodyF, 0.1F, 0.0f, -3, f2, 0F);
            this.bob(Isotelus, 0.0F, 0.0F, true, f2, 1);
        } else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(LegLeft1, 0.2F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.flap(LegRight1, 0.2F, 0.5F, true, 0, 0.5F, f2, 0.3F);
            this.flap(LegLeft2, 0.2F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight2, 0.2F, 0.5F, true, 1.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft3, 0.2F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight3, 0.2F, 0.5F, true, 2.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft4, 0.2F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight4, 0.2F, 0.5F, true, 3.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft5, 0.2F, -0.5F, true, 4.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight5, 0.2F, 0.5F, true, 4.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft6, 0.2F, -0.5F, true, 8.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight6, 0.2F, 0.5F, true, 8.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft7, 0.2F, -0.5F, true, 6.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight7, 0.2F, 0.5F, true, 6.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft8, 0.2F, -0.5F, true, 7.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight8, 0.2F, 0.5F, true, 7.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft9, 0.2F, -0.5F, true, 8.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight9, 0.2F, 0.5F, true, 8.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft10, 0.2F, -0.5F, true, 9.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight10, 0.2F, 0.5F, true, 9.0F, 0.5F, f2, 0.3F);
            this.flap(LegLeft11, 0.2F, -0.5F, true, 10.0F, -0.5F, f2, 0.3F);
            this.flap(LegRight11, 0.2F, 0.5F, true, 10.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.05F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.4F, 0.07f, -3, f2, 0.8F);
            this.bob(Isotelus, 0.2F, 0.2F, true, f2, 1);
        }

        this.swing(AnntenaeL, 0.3F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(AnntenaeR, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);

    }
}
