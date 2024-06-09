package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelHurdia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer fin;
    private final AdvancedModelRenderer fin11;
    private final AdvancedModelRenderer finlower;
    private final AdvancedModelRenderer finlower10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer finlower2;
    private final AdvancedModelRenderer finlower11;
    private final AdvancedModelRenderer fin2;
    private final AdvancedModelRenderer fin12;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer finlower3;
    private final AdvancedModelRenderer finlower12;
    private final AdvancedModelRenderer fin3;
    private final AdvancedModelRenderer fin13;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finlower4;
    private final AdvancedModelRenderer finlower13;
    private final AdvancedModelRenderer fin4;
    private final AdvancedModelRenderer fin14;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer finlower5;
    private final AdvancedModelRenderer finlower14;
    private final AdvancedModelRenderer fin5;
    private final AdvancedModelRenderer fin15;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer finlower6;
    private final AdvancedModelRenderer finlower15;
    private final AdvancedModelRenderer fin6;
    private final AdvancedModelRenderer fin16;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer finlower7;
    private final AdvancedModelRenderer finlower16;
    private final AdvancedModelRenderer fin7;
    private final AdvancedModelRenderer fin17;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer finlower8;
    private final AdvancedModelRenderer finlower19;
    private final AdvancedModelRenderer fin8;
    private final AdvancedModelRenderer fin21;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer finlower9;
    private final AdvancedModelRenderer finlower20;
    private final AdvancedModelRenderer fin9;
    private final AdvancedModelRenderer fin22;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer fin10;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer fin23;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer shield;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer appendageleft;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer appendageleft2;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer appendageleft3;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer appendageright2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer appendageright3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;

    private ModelAnimator animator;

    public ModelHurdia() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 29.75F, 4.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 15, -2.0F, -10.0F, -8.0F, 4, 3, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 16, 11, -1.5F, -10.0F, -12.0F, 3, 3, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 4, -1.0F, -7.9F, -11.0F, 2, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 17, 30, -0.5F, -7.875F, -10.5F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -9.0F, -13.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 27, -1.5F, -0.225F, 0.375F, 2, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, -10.0F, -8.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.2225F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -0.825F, -0.025F, -4.5F, 2, 3, 8, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, -10.0F, -8.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.2225F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 4, -1.175F, -0.025F, -4.5F, 2, 3, 8, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-2.25F, -10.25F, -4.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.6545F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 17, -0.85F, -1.325F, -0.4F, 1, 2, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.25F, -10.25F, -4.5F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, 0.6545F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 17, -0.15F, -1.325F, -0.4F, 1, 2, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -8.5F, -4.0F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 24, 0, -2.5F, -1.5F, 0.0F, 5, 3, 2, 0.001F, false));

        this.fin = new AdvancedModelRenderer(this);
        this.fin.setRotationPoint(2.5F, -1.5F, 1.0F);
        this.body.addChild(fin);
        this.setRotateAngle(fin, 0.0F, 0.0F, 1.2654F);
        this.fin.cubeList.add(new ModelBox(fin, 0, 28, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.fin11 = new AdvancedModelRenderer(this);
        this.fin11.setRotationPoint(-2.5F, -1.5F, 1.0F);
        this.body.addChild(fin11);
        this.setRotateAngle(fin11, 0.0F, 0.0F, -1.2654F);
        this.fin11.cubeList.add(new ModelBox(fin11, 0, 28, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.finlower = new AdvancedModelRenderer(this);
        this.finlower.setRotationPoint(2.5F, 1.5F, 1.0F);
        this.body.addChild(finlower);
        this.setRotateAngle(finlower, 0.0F, 0.0F, -0.9599F);
        this.finlower.cubeList.add(new ModelBox(finlower, 6, 25, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower10 = new AdvancedModelRenderer(this);
        this.finlower10.setRotationPoint(-2.5F, 1.5F, 1.0F);
        this.body.addChild(finlower10);
        this.setRotateAngle(finlower10, 0.0F, 0.0F, 0.9599F);
        this.finlower10.cubeList.add(new ModelBox(finlower10, 6, 25, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 14, 23, -2.5F, -1.5F, 0.0F, 5, 3, 2, 0.0F, false));

        this.finlower2 = new AdvancedModelRenderer(this);
        this.finlower2.setRotationPoint(2.5F, 1.5F, 1.0F);
        this.body2.addChild(finlower2);
        this.setRotateAngle(finlower2, 0.0F, 0.0F, -0.9599F);
        this.finlower2.cubeList.add(new ModelBox(finlower2, 12, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower11 = new AdvancedModelRenderer(this);
        this.finlower11.setRotationPoint(-2.5F, 1.5F, 1.0F);
        this.body2.addChild(finlower11);
        this.setRotateAngle(finlower11, 0.0F, 0.0F, 0.9599F);
        this.finlower11.cubeList.add(new ModelBox(finlower11, 12, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.fin2 = new AdvancedModelRenderer(this);
        this.fin2.setRotationPoint(2.5F, -1.5F, 1.0F);
        this.body2.addChild(fin2);
        this.setRotateAngle(fin2, 0.0F, 0.0F, 1.2654F);
        this.fin2.cubeList.add(new ModelBox(fin2, 10, 27, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.fin12 = new AdvancedModelRenderer(this);
        this.fin12.setRotationPoint(-2.5F, -1.5F, 1.0F);
        this.body2.addChild(fin12);
        this.setRotateAngle(fin12, 0.0F, 0.0F, -1.2654F);
        this.fin12.cubeList.add(new ModelBox(fin12, 10, 27, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 22, 6, -2.5F, -1.5F, 0.0F, 5, 3, 2, -0.001F, false));

        this.finlower3 = new AdvancedModelRenderer(this);
        this.finlower3.setRotationPoint(2.5F, 1.5F, 1.0F);
        this.body3.addChild(finlower3);
        this.setRotateAngle(finlower3, 0.0F, 0.0F, -0.9599F);
        this.finlower3.cubeList.add(new ModelBox(finlower3, 12, 15, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower12 = new AdvancedModelRenderer(this);
        this.finlower12.setRotationPoint(-2.5F, 1.5F, 1.0F);
        this.body3.addChild(finlower12);
        this.setRotateAngle(finlower12, 0.0F, 0.0F, 0.9599F);
        this.finlower12.cubeList.add(new ModelBox(finlower12, 12, 15, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.fin3 = new AdvancedModelRenderer(this);
        this.fin3.setRotationPoint(2.5F, -1.5F, 1.0F);
        this.body3.addChild(fin3);
        this.setRotateAngle(fin3, 0.0F, 0.0F, 1.2654F);
        this.fin3.cubeList.add(new ModelBox(fin3, 6, 27, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.fin13 = new AdvancedModelRenderer(this);
        this.fin13.setRotationPoint(-2.5F, -1.5F, 1.0F);
        this.body3.addChild(fin13);
        this.setRotateAngle(fin13, 0.0F, 0.0F, -1.2654F);
        this.fin13.cubeList.add(new ModelBox(fin13, 6, 27, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 22, -2.5F, -1.5F, 0.0F, 5, 3, 2, 0.0F, false));

        this.finlower4 = new AdvancedModelRenderer(this);
        this.finlower4.setRotationPoint(2.5F, 1.5F, 1.0F);
        this.body4.addChild(finlower4);
        this.setRotateAngle(finlower4, 0.0F, 0.0F, -0.9599F);
        this.finlower4.cubeList.add(new ModelBox(finlower4, 0, 15, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower13 = new AdvancedModelRenderer(this);
        this.finlower13.setRotationPoint(-2.5F, 1.5F, 1.0F);
        this.body4.addChild(finlower13);
        this.setRotateAngle(finlower13, 0.0F, 0.0F, 0.9599F);
        this.finlower13.cubeList.add(new ModelBox(finlower13, 0, 15, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.fin4 = new AdvancedModelRenderer(this);
        this.fin4.setRotationPoint(2.5F, -1.5F, 1.0F);
        this.body4.addChild(fin4);
        this.setRotateAngle(fin4, 0.0F, 0.0F, 1.2654F);
        this.fin4.cubeList.add(new ModelBox(fin4, 22, 26, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.fin14 = new AdvancedModelRenderer(this);
        this.fin14.setRotationPoint(-2.5F, -1.5F, 1.0F);
        this.body4.addChild(fin14);
        this.setRotateAngle(fin14, 0.0F, 0.0F, -1.2654F);
        this.fin14.cubeList.add(new ModelBox(fin14, 22, 26, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 16, 18, -2.5F, -1.5F, 0.0F, 5, 3, 2, 0.001F, false));

        this.finlower5 = new AdvancedModelRenderer(this);
        this.finlower5.setRotationPoint(2.0F, 1.5F, 1.0F);
        this.body5.addChild(finlower5);
        this.setRotateAngle(finlower5, 0.0F, 0.0F, -0.9599F);
        this.finlower5.cubeList.add(new ModelBox(finlower5, 12, 13, 0.325F, 0.425F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower14 = new AdvancedModelRenderer(this);
        this.finlower14.setRotationPoint(-2.0F, 1.5F, 1.0F);
        this.body5.addChild(finlower14);
        this.setRotateAngle(finlower14, 0.0F, 0.0F, 0.9599F);
        this.finlower14.cubeList.add(new ModelBox(finlower14, 12, 13, -0.325F, 0.425F, -1.0F, 0, 2, 2, 0.0F, true));

        this.fin5 = new AdvancedModelRenderer(this);
        this.fin5.setRotationPoint(2.5F, -1.75F, 1.0F);
        this.body5.addChild(fin5);
        this.setRotateAngle(fin5, 0.0F, 0.0F, 1.2654F);
        this.fin5.cubeList.add(new ModelBox(fin5, 26, 21, 0.25F, -1.925F, -1.0F, 0, 2, 2, 0.0F, false));

        this.fin15 = new AdvancedModelRenderer(this);
        this.fin15.setRotationPoint(-2.5F, -1.75F, 1.0F);
        this.body5.addChild(fin15);
        this.setRotateAngle(fin15, 0.0F, 0.0F, -1.2654F);
        this.fin15.cubeList.add(new ModelBox(fin15, 26, 21, -0.25F, -1.925F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 26, 11, -2.0F, -1.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.finlower6 = new AdvancedModelRenderer(this);
        this.finlower6.setRotationPoint(2.0F, 1.0F, 1.0F);
        this.body6.addChild(finlower6);
        this.setRotateAngle(finlower6, 0.0F, 0.0F, -0.9599F);
        this.finlower6.cubeList.add(new ModelBox(finlower6, 0, 13, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower15 = new AdvancedModelRenderer(this);
        this.finlower15.setRotationPoint(-2.0F, 1.0F, 1.0F);
        this.body6.addChild(finlower15);
        this.setRotateAngle(finlower15, 0.0F, 0.0F, 0.9599F);
        this.finlower15.cubeList.add(new ModelBox(finlower15, 0, 13, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.fin6 = new AdvancedModelRenderer(this);
        this.fin6.setRotationPoint(2.0F, -1.0F, 1.0F);
        this.body6.addChild(fin6);
        this.setRotateAngle(fin6, 0.0F, 0.0F, 1.2654F);
        this.fin6.cubeList.add(new ModelBox(fin6, 18, 26, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.fin16 = new AdvancedModelRenderer(this);
        this.fin16.setRotationPoint(-2.0F, -1.0F, 1.0F);
        this.body6.addChild(fin16);
        this.setRotateAngle(fin16, 0.0F, 0.0F, -1.2654F);
        this.fin16.cubeList.add(new ModelBox(fin16, 18, 26, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 0, -2.0F, -1.0F, 0.0F, 4, 2, 2, -0.001F, false));

        this.finlower7 = new AdvancedModelRenderer(this);
        this.finlower7.setRotationPoint(2.0F, 1.0F, 1.0F);
        this.body7.addChild(finlower7);
        this.setRotateAngle(finlower7, 0.0F, 0.0F, -0.9599F);
        this.finlower7.cubeList.add(new ModelBox(finlower7, 4, 8, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower16 = new AdvancedModelRenderer(this);
        this.finlower16.setRotationPoint(-2.0F, 1.0F, 1.0F);
        this.body7.addChild(finlower16);
        this.setRotateAngle(finlower16, 0.0F, 0.0F, 0.9599F);
        this.finlower16.cubeList.add(new ModelBox(finlower16, 4, 8, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.fin7 = new AdvancedModelRenderer(this);
        this.fin7.setRotationPoint(2.0F, -1.0F, 1.0F);
        this.body7.addChild(fin7);
        this.setRotateAngle(fin7, 0.0F, 0.0F, 1.2654F);
        this.fin7.cubeList.add(new ModelBox(fin7, 14, 26, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.fin17 = new AdvancedModelRenderer(this);
        this.fin17.setRotationPoint(-2.0F, -1.0F, 1.0F);
        this.body7.addChild(fin17);
        this.setRotateAngle(fin17, 0.0F, 0.0F, -1.2654F);
        this.fin17.cubeList.add(new ModelBox(fin17, 14, 26, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 26, 26, -1.5F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.finlower8 = new AdvancedModelRenderer(this);
        this.finlower8.setRotationPoint(1.5F, 1.0F, 1.0F);
        this.body8.addChild(finlower8);
        this.setRotateAngle(finlower8, 0.0F, 0.0F, -0.9599F);
        this.finlower8.cubeList.add(new ModelBox(finlower8, 0, 8, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower19 = new AdvancedModelRenderer(this);
        this.finlower19.setRotationPoint(-1.5F, 1.0F, 1.0F);
        this.body8.addChild(finlower19);
        this.setRotateAngle(finlower19, 0.0F, 0.0F, 0.9599F);
        this.finlower19.cubeList.add(new ModelBox(finlower19, 0, 8, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.fin8 = new AdvancedModelRenderer(this);
        this.fin8.setRotationPoint(1.5F, -1.0F, 1.0F);
        this.body8.addChild(fin8);
        this.setRotateAngle(fin8, 0.0F, 0.0F, 1.2654F);
        this.fin8.cubeList.add(new ModelBox(fin8, 10, 25, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.fin21 = new AdvancedModelRenderer(this);
        this.fin21.setRotationPoint(-1.5F, -1.0F, 1.0F);
        this.body8.addChild(fin21);
        this.setRotateAngle(fin21, 0.0F, 0.0F, -1.2654F);
        this.fin21.cubeList.add(new ModelBox(fin21, 10, 25, 0.0F, -2.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 0, 7, -1.0F, -1.0F, 0.0F, 2, 2, 1, 0.001F, false));

        this.finlower9 = new AdvancedModelRenderer(this);
        this.finlower9.setRotationPoint(1.0F, 1.0F, 1.0F);
        this.body9.addChild(finlower9);
        this.setRotateAngle(finlower9, 0.0F, 0.0F, -0.9599F);
        this.finlower9.cubeList.add(new ModelBox(finlower9, 0, 3, 0.0F, 0.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.finlower20 = new AdvancedModelRenderer(this);
        this.finlower20.setRotationPoint(-1.0F, 1.0F, 1.0F);
        this.body9.addChild(finlower20);
        this.setRotateAngle(finlower20, 0.0F, 0.0F, 0.9599F);
        this.finlower20.cubeList.add(new ModelBox(finlower20, 0, 3, 0.0F, 0.0F, -1.0F, 0, 2, 1, 0.0F, true));

        this.fin9 = new AdvancedModelRenderer(this);
        this.fin9.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.body9.addChild(fin9);
        this.setRotateAngle(fin9, 0.0F, 0.0F, 1.2654F);
        this.fin9.cubeList.add(new ModelBox(fin9, 16, 17, 0.0F, -2.0F, 0.0F, 0, 2, 1, 0.0F, false));

        this.fin22 = new AdvancedModelRenderer(this);
        this.fin22.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.body9.addChild(fin22);
        this.setRotateAngle(fin22, 0.0F, 0.0F, -1.2654F);
        this.fin22.cubeList.add(new ModelBox(fin22, 16, 17, 0.0F, -2.0F, 0.0F, 0, 2, 1, 0.0F, true));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.body9.addChild(body10);


        this.fin10 = new AdvancedModelRenderer(this);
        this.fin10.setRotationPoint(0.3644F, -0.0896F, -0.1464F);
        this.body10.addChild(fin10);
        this.setRotateAngle(fin10, 0.0F, -1.0036F, 0.0F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0481F, 0.0896F, -0.1237F);
        this.fin10.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, -0.4363F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 5, -0.75F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.fin23 = new AdvancedModelRenderer(this);
        this.fin23.setRotationPoint(-0.3644F, -0.0896F, -0.1464F);
        this.body10.addChild(fin23);
        this.setRotateAngle(fin23, 0.0F, 1.0036F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0481F, 0.0896F, -0.1237F);
        this.fin23.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.4363F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 23, 5, -4.25F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.shield = new AdvancedModelRenderer(this);
        this.shield.setRotationPoint(2.25F, -10.25F, -4.5F);
        this.main.addChild(shield);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-6.1432F, 0.1685F, -4.425F);
        this.shield.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -1.2261F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 0, -2.0293F, 0.0546F, -4.0F, 2, 0, 8, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.6432F, 0.1685F, -4.425F);
        this.shield.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 1.2261F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 0, 0.0293F, 0.0546F, -4.0F, 2, 0, 8, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.2916F, -1.39F, -6.0F);
        this.shield.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.192F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -4.1075F, 0.8495F, -6.425F, 4, 0, 12, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.2084F, -1.39F, -6.0F);
        this.shield.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.192F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.1075F, 0.8495F, -6.425F, 4, 0, 12, 0.0F, false));

        this.appendageleft = new AdvancedModelRenderer(this);
        this.appendageleft.setRotationPoint(1.8F, -8.9981F, -12.4976F);
        this.main.addChild(appendageleft);
        this.setRotateAngle(appendageleft, -0.6545F, 0.0F, 0.0F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -0.0019F, -1.5024F);
        this.appendageleft.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6981F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 29, 24, -1.0F, -1.0F, 1.15F, 1, 1, 1, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -0.056F, -1.4472F);
        this.appendageleft.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 4, -1.0F, -0.4F, 1.425F, 1, 0, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 4, 7, -1.0F, -0.2F, 1.475F, 1, 0, 2, 0.0F, false));

        this.appendageleft2 = new AdvancedModelRenderer(this);
        this.appendageleft2.setRotationPoint(0.0F, 0.9668F, -0.3598F);
        this.appendageleft.addChild(appendageleft2);
        this.setRotateAngle(appendageleft2, 0.2182F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, -1.0228F, -1.0874F);
        this.appendageleft2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 0, -1.0F, 0.275F, 1.325F, 1, 0, 2, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 9, -1.0F, 0.4F, 2.125F, 1, 0, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 8, -1.0F, 0.55F, 2.125F, 1, 0, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 9, -1.0F, 0.7F, 2.15F, 1, 0, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 15, -1.0F, 0.0F, 1.15F, 1, 1, 1, 0.0F, false));

        this.appendageleft3 = new AdvancedModelRenderer(this);
        this.appendageleft3.setRotationPoint(0.0F, 0.5203F, -0.8466F);
        this.appendageleft2.addChild(appendageleft3);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.025F, 1.3357F, 1.2068F);
        this.appendageleft3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.9163F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 10, -0.5F, -0.35F, -1.325F, 1, 0, 1, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 0, -0.475F, -0.225F, -1.4F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, 0.6666F, 0.059F);
        this.appendageleft3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0873F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 30, -1.0F, -0.7F, -0.125F, 1, 1, 1, 0.01F, false));

        this.appendageright2 = new AdvancedModelRenderer(this);
        this.appendageright2.setRotationPoint(-3.6F, 0.9668F, -0.3598F);
        this.appendageleft.addChild(appendageright2);
        this.setRotateAngle(appendageright2, 0.2182F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -1.0228F, -1.0874F);
        this.appendageright2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.6981F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 8, 0, 0.0F, 0.275F, 1.325F, 1, 0, 2, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 5, 9, 0.0F, 0.4F, 2.125F, 1, 0, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 8, 0.0F, 0.55F, 2.125F, 1, 0, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 9, 0.0F, 0.7F, 2.15F, 1, 0, 1, 0.0F, true));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 15, 0.0F, 0.0F, 1.15F, 1, 1, 1, 0.0F, true));

        this.appendageright3 = new AdvancedModelRenderer(this);
        this.appendageright3.setRotationPoint(0.0F, 0.5203F, -0.8466F);
        this.appendageright2.addChild(appendageright3);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.025F, 1.3357F, 1.2068F);
        this.appendageright3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.9163F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 10, -0.5F, -0.35F, -1.325F, 1, 0, 1, 0.0F, true));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 23, 0, -0.525F, -0.225F, -1.4F, 1, 0, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.6666F, 0.059F);
        this.appendageright3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0873F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 13, 30, 0.0F, -0.7F, -0.125F, 1, 1, 1, 0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.main.offsetZ = -0.15F;
        this.main.offsetY = -0.13F;
        this.main.render(0.018f);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(body, 0.01F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.02F, 0.01F, 0.0F);
        this.setRotateAngle(body3, 0.03F, 0.02F, 0.0F);
        this.setRotateAngle(body4, 0.04F, 0.03F, 0.0F);
        this.setRotateAngle(body5, 0.05F, 0.04F, 0.0F);
        this.setRotateAngle(body6, 0.06F, 0.05F, 0.0F);
        this.setRotateAngle(body7, 0.07F, 0.06F, 0.0F);
        this.setRotateAngle(body8, 0.08F, 0.07F, 0.0F);
        this.main.offsetY = -0.13F;
        this.main.render(0.018f);
        resetToDefaultPose();
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
        //this.body.offsetY = 0F;

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }


        AdvancedModelRenderer[] bodyF = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9};
        AdvancedModelRenderer[] leftAppend = {this.appendageleft2, this.appendageleft3};
        AdvancedModelRenderer[] rightAppend = {this.appendageright2, this.appendageright3};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(leftAppend, 0.3F, -0.3F, 0F, 0f, 0f);
            this.chainWave(rightAppend, 0.3F, -0.3F, 0F, 0f, 0f);

            this.flap(fin10, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(fin23, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);

            float degreeFin = 0.185F;
            this.flap(finlower, 0.5F, -degreeFin, false, -1.0f, -0, f2, 0.7F);
            this.flap(finlower10, 0.5F, degreeFin, false, -1.0f, 0, f2, 0.7F);
            this.flap(finlower2, 0.5F, -degreeFin, false, -0.5f, -0, f2, 0.7F);
            this.flap(finlower11, 0.5F, degreeFin, false, -0.5f, 0, f2, 0.7F);
            this.flap(finlower3, 0.5F, -degreeFin, false, 0, -0, f2, 0.7F);
            this.flap(finlower12, 0.5F, degreeFin, false, 0, 0, f2, 0.7F);
            this.flap(finlower4, 0.5F, -degreeFin, false, 0.5F, -0, f2, 0.7F);
            this.flap(finlower13, 0.5F, degreeFin, false, 0.5F, 0, f2, 0.7F);
            this.flap(finlower5, 0.5F, -degreeFin, false, 1.0F, -0, f2, 0.7F);
            this.flap(finlower14, 0.5F, degreeFin, false, 1.0F, 0, f2, 0.7F);
            this.flap(finlower6, 0.5F, -degreeFin, false, 1.5F, -0, f2, 0.7F);
            this.flap(finlower15, 0.5F, degreeFin, false, 1.5F, 0, f2, 0.7F);
            this.flap(finlower7, 0.5F, -degreeFin, false, 2.0F, -0, f2, 0.7F);
            this.flap(finlower16, 0.5F, degreeFin, false, 2.0F, 0, f2, 0.7F);
            this.flap(finlower8, 0.5F, -degreeFin, false, 2.5F, -0, f2, 0.7F);
            this.flap(finlower19, 0.5F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(finlower9, 0.5F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(finlower20, 0.5F, degreeFin, false, 3.0F, 0, f2, 0.7F);

            this.flap(fin, 0.5F, -degreeFin, false, -1.0f, -0, f2, 0.7F);
            this.flap(fin11, 0.5F, degreeFin, false, -1.0f, 0, f2, 0.7F);
            this.flap(fin2, 0.5F, -degreeFin, false, -0.5f, -0, f2, 0.7F);
            this.flap(fin12, 0.5F, degreeFin, false, -0.5f, 0, f2, 0.7F);
            this.flap(fin3, 0.5F, -degreeFin, false, 0, -0, f2, 0.7F);
            this.flap(fin13, 0.5F, degreeFin, false, 0, 0, f2, 0.7F);
            this.flap(fin4, 0.5F, -degreeFin, false, 0.5F, -0, f2, 0.7F);
            this.flap(fin14, 0.5F, degreeFin, false, 0.5F, 0, f2, 0.7F);
            this.flap(fin5, 0.5F, -degreeFin, false, 1.0F, -0, f2, 0.7F);
            this.flap(fin15, 0.5F, degreeFin, false, 1.0F, 0, f2, 0.7F);
            this.flap(fin6, 0.5F, -degreeFin, false, 1.5F, -0, f2, 0.7F);
            this.flap(fin16, 0.5F, degreeFin, false, 1.5F, 0, f2, 0.7F);
            this.flap(fin7, 0.5F, -degreeFin, false, 2.0F, -0, f2, 0.7F);
            this.flap(fin17, 0.5F, degreeFin, false, 2.0F, 0, f2, 0.7F);
            this.flap(fin8, 0.5F, -degreeFin, false, 2.5F, -0, f2, 0.7F);
            this.flap(fin21, 0.5F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(fin9, 0.5F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(fin22, 0.5F, degreeFin, false, 3.0F, 0, f2, 0.7F);

            this.chainSwing(bodyF, 0.2F, 0.1F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.28F, 0.05f, -3, f2, 0.6F);

            if (!e.isInWater()) {
                //this.body.offsetY = 0F;
                this.bob(main, -speed * 1.5F, 2.5F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(main, -speed, 0.25F, false, f2, 2);
                } else {
                    this.bob(main, -speed, 0.5F, false, f2, 2);
                }
            }
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}
