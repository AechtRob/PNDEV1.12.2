package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPromexyele extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Promexyele;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer AnalR;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    public ModelPromexyele() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.Promexyele = new AdvancedModelRenderer(this);
        this.Promexyele.setRotationPoint(0.0F, 34.0F, 0.0F);


        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -13.5F, 1.0F);
        this.Promexyele.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 23, 22, -2.5F, -4.5F, -0.1F, 5, 8, 5, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 28, -1.5F, -1.0F, -0.1F, 3, 1, 5, -0.001F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 4.9F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 21, 36, -2.0F, -4.0F, -1.0F, 4, 6, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.5F, 0.0F);
        this.Body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 15, -1.5F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.Body2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2793F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 55, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 40, 38, -1.5F, -2.7F, -1.0F, 3, 4, 5, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 24, -1.0F, -1.4F, 3.0F, 2, 1, 2, -0.002F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -4.1F, 0.0F);
        this.Body3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3142F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 7, 0.0F, -3.0F, -0.1F, 0, 3, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 10, -1.0F, 0.0F, -0.1F, 2, 2, 9, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.3F, -0.1F);
        this.Body3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2094F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 19, -1.0F, -1.9F, -0.2F, 2, 2, 9, -0.001F, false));

        this.AnalR = new AdvancedModelRenderer(this);
        this.AnalR.setRotationPoint(-1.0F, 1.7F, 1.1F);
        this.Body3.addChild(AnalR);
        this.setRotateAngle(AnalR, 0.0335F, -0.0806F, -0.8304F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AnalR.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0873F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 7, -1.0F, -0.01F, 0.0F, 1, 0, 11, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AnalR.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6109F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 11, -7.0F, 0.0F, -1.0F, 7, 0, 5, 0.0F, true));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(1.0F, 1.7F, 1.1F);
        this.Body3.addChild(AnalL);
        this.setRotateAngle(AnalL, 0.0335F, 0.0806F, 0.8304F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AnalL.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0873F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 7, 0.0F, -0.01F, 0.0F, 1, 0, 11, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AnalL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.6109F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 11, 0.0F, 0.0F, -1.0F, 7, 0, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -0.3F, 8.2F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 44, 19, -1.0F, -1.1F, -0.7F, 2, 2, 6, -0.002F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 5.3F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 54, 6, -0.5F, -1.6F, -0.3F, 1, 3, 5, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 43, 0.0F, -3.0F, 0.0F, 0, 6, 6, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -14.0F, 0.0F);
        this.Promexyele.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 45, 48, -2.0F, -1.4F, -6.1F, 4, 4, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 31, -2.5F, -2.0F, -4.0F, 5, 6, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 3.1F, -4.0F);
        this.Head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1571F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 28, -1.0F, -0.9F, -3.73F, 2, 1, 2, -0.002F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 56, 28, -1.0F, -0.9F, -4.13F, 2, 1, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 43, -2.0F, -0.9F, -2.0F, 4, 1, 2, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.6F, -4.0F);
        this.Head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.576F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 6, 7, -0.7F, -1.4F, -2.2F, 0, 1, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 2, 9, -0.4F, -1.4F, -2.6F, 0, 1, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 3.6F, -4.0F);
        this.Head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.576F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 6, 7, 0.7F, -1.4F, -2.2F, 0, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 2, 9, 0.4F, -1.4F, -2.6F, 0, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -3.6F, -2.1F);
        this.Head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1222F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 56, -2.0F, -0.0124F, 0.0881F, 4, 3, 3, 0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.1F, -4.2F);
        this.Head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.6283F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 39, 56, -2.0F, 0.0084F, -0.3313F, 4, 3, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.4F, -6.0F);
        this.Head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3665F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 7, -1.5F, 0.0F, -0.1F, 3, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.1F, -7.6F);
        this.Head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2443F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 19, -1.0F, -0.1213F, 0.06F, 2, 2, 2, -0.002F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.4F, -6.1F);
        this.Head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 48, -1.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 4.1F, -4.0F);
        this.Head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0873F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 48, -1.5F, -1.0F, -0.1F, 3, 1, 5, -0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 0.4F, -6.0F);
        this.Head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.3229F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 39, 19, -2.0F, -0.5007F, -0.3815F, 4, 1, 1, 0.04F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 22, -2.0F, -1.0007F, -0.8815F, 4, 2, 2, 0.03F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.0F, -2.2F, -0.1F);
        this.Head.addChild(PectoralL);
        this.setRotateAngle(PectoralL, -1.0353F, -0.8546F, -0.6294F);
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 14, 12, -0.5F, -0.7F, -1.0F, 3, 1, 2, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 30, 7, 2.5F, -0.7F, -1.0F, 12, 1, 2, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 35, 36, 2.5F, 0.2F, -1.55F, 12, 0, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 33, 4, 2.5F, 0.0F, -1.55F, 12, 0, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 33, 2, 2.5F, -0.2F, -1.55F, 12, 0, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 33, 0, 2.5F, -0.4F, -1.55F, 12, 0, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 30, 17, 2.5F, -0.6F, -1.55F, 12, 0, 1, 0.0F, false));
        this.PectoralL.cubeList.add(new ModelBox(PectoralL, 0, 0, 1.0F, 0.0F, -1.0F, 13, 0, 6, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, -2.2F, -0.1F);
        this.Head.addChild(PectoralR);
        this.setRotateAngle(PectoralR, -1.0353F, 0.8546F, 0.6294F);
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 14, 12, -2.5F, -0.7F, -1.0F, 3, 1, 2, 0.0F, true));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 30, 7, -14.5F, -0.7F, -1.0F, 12, 1, 2, 0.0F, true));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 35, 36, -14.5F, 0.2F, -1.55F, 12, 0, 1, 0.0F, true));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 33, 4, -14.5F, 0.0F, -1.55F, 12, 0, 1, 0.0F, true));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 33, 2, -14.5F, -0.2F, -1.55F, 12, 0, 1, 0.0F, true));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 33, 0, -14.5F, -0.4F, -1.55F, 12, 0, 1, 0.0F, true));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 30, 17, -14.5F, -0.6F, -1.55F, 12, 0, 1, 0.0F, true));
        this.PectoralR.cubeList.add(new ModelBox(PectoralR, 0, 0, -14.0F, 0.0F, -1.0F, 13, 0, 6, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 3.6F, -4.0F);
        this.Head.addChild(bone);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0873F, 0.576F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 9, 0.7F, -1.4F, -2.8F, 0, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 9, 1.0F, -1.4F, -3.2F, 0, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 9, 1.2F, -1.4F, -3.6F, 0, 1, 1, 0.0F, true));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 2, 9, 1.4F, -1.4F, -3.8F, 0, 1, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, -0.576F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 2, 9, -0.7F, -1.4F, -2.8F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 2, 9, -1.0F, -1.4F, -3.2F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 2, 9, -1.2F, -1.4F, -3.6F, 0, 1, 1, 0.0F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 2, 9, -1.4F, -1.4F, -3.8F, 0, 1, 1, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 3.6F, -4.0F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.0436F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 52, 38, -2.0F, -0.6F, -2.0F, 4, 1, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Jaw.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0698F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 56, 52, -1.0F, -0.6F, -2.0F, 2, 1, 4, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.576F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, 1.5F, -0.9F, -3.7F, 0, 1, 1, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 2, 2, 1.1F, -0.9F, -3.3F, 0, 1, 1, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 7, 0.7F, -0.9F, -2.7F, 0, 1, 1, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 2, 9, -0.4F, -0.9F, -2.6F, 0, 1, 1, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 6, 7, -0.7F, -0.9F, -2.2F, 0, 1, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Jaw.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.576F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 0, -1.5F, -0.9F, -3.7F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 2, 2, -1.1F, -0.9F, -3.3F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 7, -0.7F, -0.9F, -2.7F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 6, 7, 0.7F, -0.9F, -2.2F, 0, 1, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 2, 9, 0.4F, -0.9F, -2.6F, 0, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Promexyele.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Promexyele.rotateAngleY = (float) Math.toRadians(90);
        this.Promexyele.offsetY = -0.18F;
        this.Promexyele.offsetX = -0.05F;
        this.Promexyele.offsetZ = -0.43F;
        this.Promexyele.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Promexyele, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Body5, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, -1.3F, -0.3F, -0.1F);
        this.setRotateAngle(PectoralR, -1.3F, 0.3F, 0.1F);
        this.Promexyele.offsetY = -0.03F;
        this.Promexyele.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Promexyele.offsetY = 0.0F;
        this.Promexyele.offsetX = 0.4F;
        this.Promexyele.offsetZ = 2.0F;
        this.Promexyele.rotateAngleY = (float)Math.toRadians(120);
        this.Promexyele.rotateAngleX = (float)Math.toRadians(0);
        this.Promexyele.rotateAngleZ = (float)Math.toRadians(0);
        this.Promexyele.scaleChildren = true;
        float scaler = 2.0F;
        this.Promexyele.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Promexyele, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body1, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Body5, 0.05F, 0.1F, 0.0F);
        this.setRotateAngle(Jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(PectoralL, -1.3F, -0.3F, -0.1F);
        this.setRotateAngle(PectoralR, -1.3F, 0.3F, 0.1F);
        //End of pose, now render the model:
        this.Promexyele.render(f);
        //Reset rotations, positions and sizing:
        this.Promexyele.setScale(1.0F, 1.0F, 1.0F);
        this.Promexyele.scaleChildren = false;
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
        //this.Promexyele.offsetY = 1.1F;

        AdvancedModelRenderer[] finLeft = {this.PectoralL};
        AdvancedModelRenderer[] finRight = {this.PectoralR};
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};
        float speed = 0.2F;
        if (!e.isInWater()) {
            speed = 0.6F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            if (f3 != 0 || !(e.isInWater())) {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
                this.swing(Promexyele, speed, 0.3F, true, 0, 0, f2, 1);
            }

            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finLeft, speed, -0.30F, -0.8, f2, 1);

            this.walk(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finRight, speed, 0.30F, 0.8, f2, 1);

            this.walk(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(AnalR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(AnalR, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
            this.flap(AnalR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

            if (!e.isInWater()) {
                this.Promexyele.rotateAngleZ = (float) Math.toRadians(90);
                this.Promexyele.offsetY = -0.7F;
                this.Promexyele.offsetX = -0.7F;
                this.Promexyele.offsetZ = -0.5F;
                this.bob(Promexyele, -speed, 5F, false, f2, 1);
            }
        }
    }
}
