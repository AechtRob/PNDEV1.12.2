package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraMawsonia;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMawsonia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer PectoralFinright;
    private final AdvancedModelRenderer PectoralFinleft;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer PelvicFinright;
    private final AdvancedModelRenderer PelvicFinleft;
    private final AdvancedModelRenderer upperpseudomaxilla;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer lowerpseudomaxilla;

    public ModelMawsonia() {
        this.textureWidth = 144;
        this.textureHeight = 176;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.0F, 6.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 31, -6.5F, -13.75F, -16.0F, 13, 13, 13, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 52, 42, -3.0F, -10.75F, -26.75F, 6, 2, 2, 0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 39, 41, -3.0F, -10.25F, -26.25F, 6, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.5F, -12.75F, -23.75F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 37, 0, -1.5F, 1.0F, -4.4F, 6, 4, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, -11.0F, -21.6F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 71, 140, -1.5F, 2.0F, -4.4F, 6, 2, 2, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.75F, -11.5F, -21.5F);
        this.Body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.1345F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 57, -3.95F, -2.775F, -6.475F, 2, 6, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 57, 0.45F, -2.775F, -6.475F, 2, 6, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, -12.85F, -24.5F);
        this.Body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.0908F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 57, -1.5F, 0.1F, -6.5F, 5, 5, 3, 0.01F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 57, -1.5F, -1.9F, -6.5F, 5, 5, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, -11.4F, -22.8F);
        this.Body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 68, 0.0F, -0.9F, -7.25F, 4, 2, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, -15.5F, -12.5F);
        this.Body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 107, 79, -3.0F, -1.0F, -12.9F, 8, 5, 5, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.5F, -3.5F, -12.25F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 56, 100, -7.5F, -8.75F, -7.0F, 12, 9, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -4.0F, -15.975F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 107, 68, -5.5F, -6.75F, -7.0F, 10, 7, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -15.85F, -13.5F);
        this.Body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 94, -4.5F, 0.0F, -8.0F, 9, 5, 8, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -15.75F, -14.0F);
        this.Body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2793F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 70, 34, -6.0F, 0.0F, 0.0F, 12, 5, 10, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.35F, -16.0F);
        this.Body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 18, -5.5F, -3.25F, 0.0F, 11, 3, 13, 0.0F, false));

        this.PectoralFinright = new AdvancedModelRenderer(this);
        this.PectoralFinright.setRotationPoint(-6.0F, -4.75F, -6.5F);
        this.Body.addChild(PectoralFinright);
        this.setRotateAngle(PectoralFinright, -1.1345F, -0.2618F, 0.3491F);
        this.PectoralFinright.cubeList.add(new ModelBox(PectoralFinright, 99, 104, -0.5F, -1.5F, 0.0F, 2, 3, 11, 0.0F, false));
        this.PectoralFinright.cubeList.add(new ModelBox(PectoralFinright, 39, 21, 0.5F, -3.5F, 4.0F, 0, 7, 13, 0.0F, false));

        this.PectoralFinleft = new AdvancedModelRenderer(this);
        this.PectoralFinleft.setRotationPoint(6.0F, -4.75F, -6.5F);
        this.Body.addChild(PectoralFinleft);
        this.setRotateAngle(PectoralFinleft, -1.1345F, 0.2618F, -0.3491F);
        this.PectoralFinleft.cubeList.add(new ModelBox(PectoralFinleft, 99, 104, -1.5F, -1.5F, 0.0F, 2, 3, 11, 0.0F, true));
        this.PectoralFinleft.cubeList.add(new ModelBox(PectoralFinleft, 39, 21, -0.5F, -3.5F, 4.0F, 0, 7, 13, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -9.0F, -4.75F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 69, 0.0F, -22.0F, 0.25F, 0, 13, 12, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.0F, 11.5F, 8.75F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 0, -4.0F, -4.0F, -8.0F, 10, 3, 12, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 9.6F, 7.75F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0175F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -6.0F, -19.0F, -8.0F, 12, 18, 13, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 12.75F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 41, 46, -4.5F, -6.25F, -1.0F, 9, 14, 11, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.5F, -7.0F, 7.5F);
        this.Body3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.8116F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 31, 52, 0.5F, -8.25F, -2.0F, 0, 6, 5, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5F, 6.5F, 6.5F);
        this.Body3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.9599F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.5F, 6.5F, -2.0F, 0, 8, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.5F, 8.75F, 7.25F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.9599F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 31, -0.5F, 0.0F, 0.0F, 2, 8, 3, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, -7.5F, 9.0F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.8116F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 74, 22, -0.5F, -3.25F, -2.0F, 2, 5, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -5.95F, 5.25F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 84, 91, -3.5F, -2.25F, -6.0F, 8, 3, 10, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 8.75F, 5.0F);
        this.Body3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 80, 78, -3.5F, -1.75F, -6.0F, 8, 2, 11, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 28, 71, -3.5F, -7.65F, -1.0F, 7, 15, 10, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 7.75F, 1.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.2618F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 102, 0, -3.0F, -2.9F, -2.5F, 6, 3, 10, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 69, 59, -2.5F, 0.1F, -1.75F, 5, 4, 12, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 34, 85, 0.0F, -10.55F, 8.5F, 0, 13, 11, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 129, 0.0F, -10.55F, -2.5F, 0, 24, 11, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 37, 5, -0.01F, 1.7F, 19.5F, 0, 4, 4, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 88, 93, 0.0F, 3.7F, 8.5F, 0, 10, 11, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.5F, -5.25F, -35.0F);
        this.Body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3665F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 87, 129, -1.5F, -11.65F, 44.0F, 2, 2, 7, -0.01F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.5F, 10.6F, -35.0F);
        this.Body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0611F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 112, 124, -1.5F, -11.65F, 44.0F, 2, 2, 11, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.1F, 9.0F);
        this.Body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.4625F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 43, 120, -2.0F, -0.8F, -12.95F, 4, 5, 13, 0.01F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 2.1F, 9.25F);
        this.Body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.5847F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 120, -2.0F, -2.8F, -12.95F, 4, 7, 13, 0.0F, false));

        this.PelvicFinright = new AdvancedModelRenderer(this);
        this.PelvicFinright.setRotationPoint(-1.5F, 9.5F, 9.5F);
        this.Body2.addChild(PelvicFinright);
        this.setRotateAngle(PelvicFinright, -0.829F, -0.3927F, 0.0436F);
        this.PelvicFinright.cubeList.add(new ModelBox(PelvicFinright, 21, 57, -1.0F, -2.25F, 0.0F, 1, 3, 8, 0.0F, false));
        this.PelvicFinright.cubeList.add(new ModelBox(PelvicFinright, 70, 38, -0.5F, -4.0F, 3.0F, 0, 6, 11, 0.0F, false));

        this.PelvicFinleft = new AdvancedModelRenderer(this);
        this.PelvicFinleft.setRotationPoint(1.5F, 9.5F, 9.5F);
        this.Body2.addChild(PelvicFinleft);
        this.setRotateAngle(PelvicFinleft, -0.829F, 0.3927F, -0.0436F);
        this.PelvicFinleft.cubeList.add(new ModelBox(PelvicFinleft, 21, 57, 0.0F, -2.25F, 0.0F, 1, 3, 8, 0.0F, true));
        this.PelvicFinleft.cubeList.add(new ModelBox(PelvicFinleft, 70, 38, 0.5F, -4.0F, 3.0F, 0, 6, 11, 0.0F, true));

        this.upperpseudomaxilla = new AdvancedModelRenderer(this);
        this.upperpseudomaxilla.setRotationPoint(-0.5F, -8.0F, -29.25F);
        this.Body.addChild(upperpseudomaxilla);
        this.setRotateAngle(upperpseudomaxilla, -0.48F, 0.0F, 0.0F);
        this.upperpseudomaxilla.cubeList.add(new ModelBox(upperpseudomaxilla, 114, 137, -1.5F, -2.0F, 0.1F, 4, 2, 8, 0.03F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, -4.0F, -16.0F);
        this.Body.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.4363F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 107, -3.5F, -3.51F, -7.0F, 7, 7, 6, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 104, 25, -5.0F, -3.5F, -3.0F, 10, 7, 5, -0.01F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(1.0F, 2.0F, -13.25F);
        this.Jaw.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.1745F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 63, 39, -3.0F, 0.575F, 4.7F, 4, 1, 2, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(1.0F, 2.1F, -13.25F);
        this.Jaw.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.3054F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 63, 39, -3.0F, 0.575F, 4.7F, 4, 1, 2, -0.01F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(1.0F, 1.85F, -13.25F);
        this.Jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.3054F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 60, 36, -3.0F, 0.0F, 2.0F, 4, 1, 5, 0.0F, false));
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 60, 36, -3.0F, 0.0F, 0.0F, 4, 1, 5, 0.02F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.5F, 2.55F, -8.5F);
        this.Jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0436F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 65, -2.0F, -1.0F, -2.75F, 3, 1, 5, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.5F, 3.3F, -8.5F);
        this.Jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 65, -2.0F, -1.0F, -2.75F, 3, 1, 5, 0.01F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 65, -2.0F, -1.0F, -4.75F, 3, 1, 5, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(1.0F, 2.75F, -8.5F);
        this.Jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0436F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 52, 73, -3.0F, -1.0F, -4.75F, 4, 1, 5, -0.015F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(1.0F, 2.25F, -8.5F);
        this.Jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 52, 73, -3.0F, -1.0F, -4.75F, 4, 1, 5, 0.01F, false));

        this.lowerpseudomaxilla = new AdvancedModelRenderer(this);
        this.lowerpseudomaxilla.setRotationPoint(0.0F, 2.0F, -13.25F);
        this.Jaw.addChild(lowerpseudomaxilla);
        this.setRotateAngle(lowerpseudomaxilla, 0.3054F, 0.0F, 0.0F);
        this.lowerpseudomaxilla.cubeList.add(new ModelBox(lowerpseudomaxilla, 113, 147, -2.0F, -0.1F, 0.0F, 4, 2, 6, -0.02F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -0.40F;
        this.Body.offsetX = 0.175F;
        this.Body.rotateAngleY = (float)Math.toRadians(220);
        this.Body.rotateAngleX = (float)Math.toRadians(8);
        this.Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Body.scaleChildren = true;
        float scaler = 0.51F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Jaw, -0.25F, 0.0F, 0.0F);
        this.Body.offsetY = 0.05F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Jaw, 0.1F, 0.0F, 0.0F);
        this.Body.offsetY = -0.3F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.Bodyfront.offsetY = 1.3F;

        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};

        float speed = 0.166F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 1.3F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.6F;
        }
        if (!e.isInWater()) {
            speed = 0.15F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);


            //this.walk(Jaw, (float) (speed * 0.5), 0.1F, true, -0.8F, -0.1F, f2, 1);


        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.50F * still, -1.25, f2, 0.5F * still);
            this.swing(Body, speed*still, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(Body, speed*still, 0.1F, true, 0, 0, f2, 0.5F);
        }

        this.walk(PectoralFinleft, (float) (speed * 0.75*still), 0.1F, true, 3, 0, f2, 1);
        this.swing(PectoralFinleft, (float) (speed * 0.75*still), 0.1F, true, 3, 0, f2, 1);
        this.walk(PectoralFinright, (float) (speed * 0.75*still), 0.1F, true, 0, 0, f2, 1);
        this.swing(PectoralFinright, (float) (speed * 0.75*still), -0.1F, true, 0, 0, f2, 1);

        this.walk(PelvicFinleft, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);
        this.swing(PelvicFinleft, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);
        this.flap(PelvicFinleft, (float) (speed * 0.75*still), 0.2F, true, 0, 0, f2, 1);

        this.walk(PelvicFinright, (float) (speed * 0.75*still), 0.2F, true, 3, 0, f2, 1);
        this.swing(PelvicFinright, (float) (speed * 0.75*still), -0.2F, true, 3, 0, f2, 1);
        this.flap(PelvicFinright, (float) (speed * 0.75*still), 0.2F, true, 3, 0, f2, 1);

        if (!e.isInWater()) {
            this.Body.rotateAngleZ = (float) Math.toRadians(90);
            this.Body.offsetY = -0.3F;
            this.Body.offsetX = -0.8F;
            this.bob(Body, -speed * 1.8F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.5F, 0.02F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.5F, 0.2F, -0.55, f2, 0.4F * still);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMawsonia ee = (EntityPrehistoricFloraMawsonia) entitylivingbaseIn;

        if (ee.getAnimation() == ee.ATTACK_ANIMATION || ee.getAnimation() == ee.ROAR_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMawsonia entity = (EntityPrehistoricFloraMawsonia) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -15 + (((tickAnim - 10) / 5) * (0-(-15)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperpseudomaxilla, upperpseudomaxilla.rotateAngleX + (float) Math.toRadians(xx), upperpseudomaxilla.rotateAngleY + (float) Math.toRadians(yy), upperpseudomaxilla.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 22.5 + (((tickAnim - 10) / 5) * (0-(22.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 10) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerpseudomaxilla, lowerpseudomaxilla.rotateAngleX + (float) Math.toRadians(xx), lowerpseudomaxilla.rotateAngleY + (float) Math.toRadians(yy), lowerpseudomaxilla.rotateAngleZ + (float) Math.toRadians(zz));

    }

}

