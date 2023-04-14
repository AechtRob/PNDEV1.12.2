package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnomalocaris;
import net.lepidodendron.entity.EntityPrehistoricFloraCordaticaris;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelCordaticaris extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer finlower;
    private final AdvancedModelRenderer finlower10;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer finlower2;
    private final AdvancedModelRenderer finlower11;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer finlower3;
    private final AdvancedModelRenderer finlower12;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer finlower4;
    private final AdvancedModelRenderer finlower13;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer finlower5;
    private final AdvancedModelRenderer finlower14;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer finlower6;
    private final AdvancedModelRenderer finlower15;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer finlower7;
    private final AdvancedModelRenderer finlower16;
    private final AdvancedModelRenderer body11;
    private final AdvancedModelRenderer finlower8;
    private final AdvancedModelRenderer finlower17;
    private final AdvancedModelRenderer body12;
    private final AdvancedModelRenderer finlower9;
    private final AdvancedModelRenderer finlower18;
    private final AdvancedModelRenderer body13;
    private final AdvancedModelRenderer fintail1;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer fintail2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer shield;
    private final AdvancedModelRenderer shield2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer shield3;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer appendageleft;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer appendageright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;

    private ModelAnimator animator;

    public ModelCordaticaris() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 18.0F, 2.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -1.3F, -8.0F, 6, 3, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 51, -2.5F, -1.3F, -11.0F, 5, 2, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 34, 0, -2.5F, -1.3F, -20.0F, 5, 1, 9, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 42, 7, -1.5F, -1.3F, -21.0F, 3, 1, 2, -0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 39, 2, -1.0F, -1.3F, -22.0F, 2, 1, 7, -0.014F, false));
        this.main.cubeList.add(new ModelBox(main, 51, 16, -1.0F, 0.8F, -7.3F, 2, 1, 2, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 14, 22, -0.5F, 0.825F, -6.8F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -1.3F, -8.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3971F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 26, -3.125F, 1.275F, -11.5F, 0, 8, 16, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, -1.3F, -8.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3971F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 26, 3.125F, 1.275F, -11.5F, 0, 8, 16, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.25F, -0.25F, -4.5F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -1.5272F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 0, -0.2716F, -2.5074F, -0.4F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.25F, -0.25F, -4.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 1.5272F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 0, -0.7284F, -2.5074F, -0.4F, 1, 1, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.main.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 33, 42, -3.0F, -1.8F, -2.0F, 6, 4, 2, 0.001F, false));

        this.finlower = new AdvancedModelRenderer(this);
        this.finlower.setRotationPoint(3.0F, 2.2F, -1.0F);
        this.body4.addChild(finlower);
        this.setRotateAngle(finlower, 0.0F, 0.0F, -0.9599F);
        this.finlower.cubeList.add(new ModelBox(finlower, 53, 11, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.finlower10 = new AdvancedModelRenderer(this);
        this.finlower10.setRotationPoint(-3.0F, 2.2F, -1.0F);
        this.body4.addChild(finlower10);
        this.setRotateAngle(finlower10, 0.0F, 0.0F, 0.9599F);
        this.finlower10.cubeList.add(new ModelBox(finlower10, 53, 11, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 15, -4.0F, -1.8F, 0.0F, 8, 4, 2, 0.0F, false));

        this.finlower2 = new AdvancedModelRenderer(this);
        this.finlower2.setRotationPoint(4.0F, 2.2F, 1.0F);
        this.body5.addChild(finlower2);
        this.setRotateAngle(finlower2, 0.0F, 0.0F, -0.9599F);
        this.finlower2.cubeList.add(new ModelBox(finlower2, 54, 0, 0.0F, 0.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.finlower11 = new AdvancedModelRenderer(this);
        this.finlower11.setRotationPoint(-4.0F, 2.2F, 1.0F);
        this.body5.addChild(finlower11);
        this.setRotateAngle(finlower11, 0.0F, 0.0F, 0.9599F);
        this.finlower11.cubeList.add(new ModelBox(finlower11, 54, 0, 0.0F, 0.0F, -1.0F, 0, 3, 2, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 0, 8, -4.0F, -1.8F, 0.0F, 8, 4, 2, -0.001F, false));

        this.finlower3 = new AdvancedModelRenderer(this);
        this.finlower3.setRotationPoint(4.0F, 2.2F, 1.0F);
        this.body6.addChild(finlower3);
        this.setRotateAngle(finlower3, 0.0F, 0.0F, -0.9599F);
        this.finlower3.cubeList.add(new ModelBox(finlower3, 27, 53, 0.0F, 0.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.finlower12 = new AdvancedModelRenderer(this);
        this.finlower12.setRotationPoint(-4.0F, 2.2F, 1.0F);
        this.body6.addChild(finlower12);
        this.setRotateAngle(finlower12, 0.0F, 0.0F, 0.9599F);
        this.finlower12.cubeList.add(new ModelBox(finlower12, 27, 53, 0.0F, 0.0F, -1.0F, 0, 4, 2, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 34, 11, -3.5F, -1.8F, 0.0F, 7, 4, 2, 0.0F, false));

        this.finlower4 = new AdvancedModelRenderer(this);
        this.finlower4.setRotationPoint(3.5F, 2.2F, 1.0F);
        this.body7.addChild(finlower4);
        this.setRotateAngle(finlower4, 0.0F, 0.0F, -0.9599F);
        this.finlower4.cubeList.add(new ModelBox(finlower4, 22, 51, 0.0F, 0.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.finlower13 = new AdvancedModelRenderer(this);
        this.finlower13.setRotationPoint(-3.5F, 2.2F, 1.0F);
        this.body7.addChild(finlower13);
        this.setRotateAngle(finlower13, 0.0F, 0.0F, 0.9599F);
        this.finlower13.cubeList.add(new ModelBox(finlower13, 22, 51, 0.0F, 0.0F, -1.0F, 0, 4, 2, 0.0F, true));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 41, 26, -3.5F, -0.8F, 0.0F, 7, 3, 2, 0.001F, false));
        this.body8.cubeList.add(new ModelBox(body8, 31, 50, -3.5F, -1.5F, 0.0F, 7, 2, 2, 0.0F, false));

        this.finlower5 = new AdvancedModelRenderer(this);
        this.finlower5.setRotationPoint(3.5F, 2.2F, 1.0F);
        this.body8.addChild(finlower5);
        this.setRotateAngle(finlower5, 0.0F, 0.0F, -0.9599F);
        this.finlower5.cubeList.add(new ModelBox(finlower5, 17, 51, 0.0F, 0.0F, -1.0F, 0, 4, 2, 0.0F, false));

        this.finlower14 = new AdvancedModelRenderer(this);
        this.finlower14.setRotationPoint(-3.5F, 2.2F, 1.0F);
        this.body8.addChild(finlower14);
        this.setRotateAngle(finlower14, 0.0F, 0.0F, 0.9599F);
        this.finlower14.cubeList.add(new ModelBox(finlower14, 17, 51, 0.0F, 0.0F, -1.0F, 0, 4, 2, 0.0F, true));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 34, 18, -3.5F, -0.8F, 0.0F, 7, 3, 2, 0.001F, false));
        this.body9.cubeList.add(new ModelBox(body9, 48, 47, -3.5F, -1.5F, 0.0F, 7, 2, 2, 0.0F, false));

        this.finlower6 = new AdvancedModelRenderer(this);
        this.finlower6.setRotationPoint(3.5F, 2.2F, 1.0F);
        this.body9.addChild(finlower6);
        this.setRotateAngle(finlower6, 0.0F, 0.0F, -0.9599F);
        this.finlower6.cubeList.add(new ModelBox(finlower6, 41, 32, 0.0F, 0.0F, -1.0F, 0, 3, 2, 0.0F, false));

        this.finlower15 = new AdvancedModelRenderer(this);
        this.finlower15.setRotationPoint(-3.5F, 2.2F, 1.0F);
        this.body9.addChild(finlower15);
        this.setRotateAngle(finlower15, 0.0F, 0.0F, 0.9599F);
        this.finlower15.cubeList.add(new ModelBox(finlower15, 41, 32, 0.0F, 0.0F, -1.0F, 0, 3, 2, 0.0F, true));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 50, 52, -3.0F, -1.3F, 0.0F, 6, 3, 2, 0.0F, false));

        this.finlower7 = new AdvancedModelRenderer(this);
        this.finlower7.setRotationPoint(3.0F, 1.7F, 1.0F);
        this.body10.addChild(finlower7);
        this.setRotateAngle(finlower7, 0.0F, 0.0F, -0.9599F);
        this.finlower7.cubeList.add(new ModelBox(finlower7, 19, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.finlower16 = new AdvancedModelRenderer(this);
        this.finlower16.setRotationPoint(-3.0F, 1.7F, 1.0F);
        this.body10.addChild(finlower16);
        this.setRotateAngle(finlower16, 0.0F, 0.0F, 0.9599F);
        this.finlower16.cubeList.add(new ModelBox(finlower16, 19, 20, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body11 = new AdvancedModelRenderer(this);
        this.body11.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body10.addChild(body11);
        this.body11.cubeList.add(new ModelBox(body11, 52, 32, -3.0F, -1.3F, 0.0F, 6, 3, 2, -0.001F, false));

        this.finlower8 = new AdvancedModelRenderer(this);
        this.finlower8.setRotationPoint(3.0F, 1.7F, 1.0F);
        this.body11.addChild(finlower8);
        this.setRotateAngle(finlower8, 0.0F, 0.0F, -0.9599F);
        this.finlower8.cubeList.add(new ModelBox(finlower8, 19, 13, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.finlower17 = new AdvancedModelRenderer(this);
        this.finlower17.setRotationPoint(-3.0F, 1.7F, 1.0F);
        this.body11.addChild(finlower17);
        this.setRotateAngle(finlower17, 0.0F, 0.0F, 0.9599F);
        this.finlower17.cubeList.add(new ModelBox(finlower17, 19, 13, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.body12 = new AdvancedModelRenderer(this);
        this.body12.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body11.addChild(body12);
        this.body12.cubeList.add(new ModelBox(body12, 0, 26, -2.5F, -0.3F, 0.0F, 5, 2, 2, 0.0F, false));
        this.body12.cubeList.add(new ModelBox(body12, 17, 26, -2.5F, -0.9F, 0.0F, 5, 1, 2, -0.01F, false));
        this.body12.cubeList.add(new ModelBox(body12, 17, 30, -2.0F, -0.3F, 2.0F, 4, 2, 1, 0.001F, false));

        this.finlower9 = new AdvancedModelRenderer(this);
        this.finlower9.setRotationPoint(2.5F, 1.7F, 1.0F);
        this.body12.addChild(finlower9);
        this.setRotateAngle(finlower9, 0.0F, 0.0F, -0.9599F);
        this.finlower9.cubeList.add(new ModelBox(finlower9, 19, 6, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, false));

        this.finlower18 = new AdvancedModelRenderer(this);
        this.finlower18.setRotationPoint(-2.5F, 1.7F, 1.0F);
        this.body12.addChild(finlower18);
        this.setRotateAngle(finlower18, 0.0F, 0.0F, 0.9599F);
        this.finlower18.cubeList.add(new ModelBox(finlower18, 19, 6, 0.0F, 0.0F, -1.0F, 0, 1, 2, 0.0F, true));

        this.body13 = new AdvancedModelRenderer(this);
        this.body13.setRotationPoint(1.0F, -10.0F, 8.0F);
        this.body12.addChild(body13);


        this.fintail1 = new AdvancedModelRenderer(this);
        this.fintail1.setRotationPoint(0.0F, 11.2F, -5.0F);
        this.body13.addChild(fintail1);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fintail1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0751F, 0.5993F, 0.2588F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 32, -1.1F, 0.0F, -0.9F, 2, 0, 6, 0.0F, false));

        this.fintail2 = new AdvancedModelRenderer(this);
        this.fintail2.setRotationPoint(-2.0F, 11.2F, -5.0F);
        this.body13.addChild(fintail2);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.fintail2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0751F, -0.5993F, -0.2588F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 41, 32, -0.9F, 0.0F, -0.9F, 2, 0, 6, 0.0F, true));

        this.shield = new AdvancedModelRenderer(this);
        this.shield.setRotationPoint(-12.75F, -11.25F, 0.5F);
        this.main.addChild(shield);


        this.shield2 = new AdvancedModelRenderer(this);
        this.shield2.setRotationPoint(-0.05F, -2.15F, -11.5F);
        this.main.addChild(shield2);
        this.setRotateAngle(shield2, 0.0F, 0.0F, 0.0349F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(3.8432F, 0.8685F, 2.575F);
        this.shield2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.7025F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 17, 26, 0.0268F, -0.0997F, -10.0F, 4, 0, 15, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0916F, -0.79F, 1.0F);
        this.shield2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.192F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.1075F, 0.8495F, -14.425F, 4, 0, 25, 0.0F, false));

        this.shield3 = new AdvancedModelRenderer(this);
        this.shield3.setRotationPoint(0.05F, -2.15F, -11.5F);
        this.main.addChild(shield3);
        this.setRotateAngle(shield3, 0.0F, 0.0F, -0.0349F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-3.8432F, 0.8685F, 2.575F);
        this.shield3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.7025F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 26, -4.0268F, -0.0997F, -10.0F, 4, 0, 15, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.0916F, -0.79F, 1.0F);
        this.shield3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.192F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -4.1075F, 0.8495F, -14.425F, 4, 0, 25, 0.0F, true));

        this.appendageleft = new AdvancedModelRenderer(this);
        this.appendageleft.setRotationPoint(1.4F, 0.2019F, -7.7976F);
        this.main.addChild(appendageleft);
        this.setRotateAngle(appendageleft, -0.6545F, 0.0F, 0.0F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, -10.9792F, -3.6232F);
        this.appendageleft.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.6981F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 31, -2.0F, 5.9809F, 9.5379F, 1, 7, 1, 0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5F, -11.0334F, -3.568F);
        this.appendageleft.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6981F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 22, -2.0F, 8.3809F, 10.2129F, 1, 0, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 22, -2.0F, 8.7809F, 10.4129F, 1, 0, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 31, -2.0F, 9.1809F, 9.6129F, 1, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 0, -2.0F, 9.5809F, 9.7129F, 1, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 4, -2.0F, 9.9809F, 9.8129F, 1, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 34, -2.0F, 10.3809F, 10.0129F, 1, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 35, -2.0F, 10.7809F, 10.1129F, 1, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 23, 35, -2.0F, 11.1809F, 10.2129F, 1, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 21, -2.0F, 11.5809F, 10.1129F, 1, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 42, -2.0F, 11.9809F, 9.8129F, 1, 0, 3, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 38, -2.0F, 12.3809F, 10.2129F, 1, 0, 2, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 3, 39, -2.0F, 12.7809F, 9.8129F, 1, 0, 2, 0.0F, false));

        this.appendageright = new AdvancedModelRenderer(this);
        this.appendageright.setRotationPoint(-1.4F, 0.2019F, -7.7976F);
        this.main.addChild(appendageright);
        this.setRotateAngle(appendageright, -0.6545F, 0.0F, 0.0F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.5F, -10.9792F, -3.6232F);
        this.appendageright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 31, 1.0F, 5.9809F, 9.5379F, 1, 7, 1, 0.001F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.5F, -11.0334F, -3.568F);
        this.appendageright.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 22, 1.0F, 8.3809F, 10.2129F, 1, 0, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 22, 1.0F, 8.7809F, 10.4129F, 1, 0, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 31, 1.0F, 9.1809F, 9.6129F, 1, 0, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 0, 1.0F, 9.5809F, 9.7129F, 1, 0, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 4, 1.0F, 9.9809F, 9.8129F, 1, 0, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 34, 1.0F, 10.3809F, 10.0129F, 1, 0, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 5, 35, 1.0F, 10.7809F, 10.1129F, 1, 0, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 23, 35, 1.0F, 11.1809F, 10.2129F, 1, 0, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 21, 1.0F, 11.5809F, 10.1129F, 1, 0, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 42, 1.0F, 11.9809F, 9.8129F, 1, 0, 3, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 38, 1.0F, 12.3809F, 10.2129F, 1, 0, 2, 0.0F, true));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 3, 39, 1.0F, 12.7809F, 9.8129F, 1, 0, 2, 0.0F, true));

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

        EntityPrehistoricFloraCordaticaris ee = (EntityPrehistoricFloraCordaticaris) e;

        AdvancedModelRenderer[] bodyF = {this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10, this.body11, this.body12, this.body13};

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if (ee.getAnimation() != ee.ATTACK_ANIMATION) {
                this.walk(appendageleft, 0.3F, -0.3F, false, 0f, 0f, f2, 1F);
                this.walk(appendageright, 0.3F, -0.3F, false, 0f, 0f, f2, 1F);
            }

            this.flap(fintail1, 1F, -0.16F, false, -2F, 0F, f2, 0.7F);
            this.flap(fintail2, 1F, 0.16F, false, -2F, 0F, f2, 0.7F);

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
            this.flap(finlower17, 0.5F, degreeFin, false, 2.5F, 0, f2, 0.7F);
            this.flap(finlower9, 0.5F, -degreeFin, false, 3.0F, -0, f2, 0.7F);
            this.flap(finlower18, 0.5F, degreeFin, false, 3.0F, 0, f2, 0.7F);

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
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        //Duration 40

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(15);
        animator.rotate(this.appendageleft, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageright, (float) Math.toRadians(-60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.startKeyframe(3);
        animator.rotate(this.appendageleft, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.appendageright, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(12);
    }
}
