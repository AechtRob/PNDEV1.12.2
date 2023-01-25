package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraOrthrozanclus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelOrthrozanclus extends AdvancedModelBase {
    private final AdvancedModelRenderer Orthozanclus;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer spine;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer spine12;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer spine2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer spine17;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer spine3;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer spine18;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer spine4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer spine19;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer spine13;
    private final AdvancedModelRenderer spine20;
    private final AdvancedModelRenderer spine14;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer spine21;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer spine22;
    private final AdvancedModelRenderer spine15;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer spine5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer spine23;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer spine6;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer spine24;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer spine7;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer spine25;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer spine8;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer spine26;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer spine9;
    private final AdvancedModelRenderer spine27;
    private final AdvancedModelRenderer spine10;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer spine28;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer spine11;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer spine29;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer spine16;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer spine30;
    private final AdvancedModelRenderer cube_r24;

    public ModelOrthrozanclus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Orthozanclus = new AdvancedModelRenderer(this);
        this.Orthozanclus.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Orthozanclus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 12, -1.0F, -1.5F, -4.75F, 2, 1, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 6, -1.5F, -1.0F, -5.0F, 3, 1, 5, 0.0F, false));

        this.spine = new AdvancedModelRenderer(this);
        this.spine.setRotationPoint(-1.0F, -1.0F, -4.25F);
        this.body.addChild(spine);
        this.setRotateAngle(spine, -0.063F, -0.4454F, 0.5142F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.1607F, 0.0F, -0.1915F);
        this.spine.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, -0.2182F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 20, -3.5F, -1.75F, 0.25F, 4, 2, 0, 0.0F, false));

        this.spine12 = new AdvancedModelRenderer(this);
        this.spine12.setRotationPoint(1.0F, -1.0F, -4.25F);
        this.body.addChild(spine12);
        this.setRotateAngle(spine12, -0.063F, 0.4454F, -0.5142F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.1607F, 0.0F, -0.1915F);
        this.spine12.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.2182F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 20, -0.5F, -1.75F, 0.25F, 4, 2, 0, 0.0F, true));

        this.spine2 = new AdvancedModelRenderer(this);
        this.spine2.setRotationPoint(-1.0F, -1.0F, -3.25F);
        this.body.addChild(spine2);
        this.setRotateAngle(spine2, 0.0F, 0.0F, 0.6545F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.25F, -0.25F, 0.0F);
        this.spine2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.2182F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 6, -6.0F, -1.5F, 0.0F, 6, 2, 0, 0.0F, false));

        this.spine17 = new AdvancedModelRenderer(this);
        this.spine17.setRotationPoint(1.0F, -1.0F, -3.25F);
        this.body.addChild(spine17);
        this.setRotateAngle(spine17, 0.0F, 0.0F, -0.6545F);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.spine17.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.2182F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 6, 0.0F, -1.5F, 0.0F, 6, 2, 0, 0.0F, true));

        this.spine3 = new AdvancedModelRenderer(this);
        this.spine3.setRotationPoint(-1.0F, -1.0F, -2.0F);
        this.body.addChild(spine3);
        this.setRotateAngle(spine3, 0.0F, 0.0F, 0.6545F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.25F, -0.25F, 0.0F);
        this.spine3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.2182F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 4, -6.0F, -1.5F, 0.0F, 6, 2, 0, 0.0F, false));

        this.spine18 = new AdvancedModelRenderer(this);
        this.spine18.setRotationPoint(1.0F, -1.0F, -2.0F);
        this.body.addChild(spine18);
        this.setRotateAngle(spine18, 0.0F, 0.0F, -0.6545F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.spine18.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.2182F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 4, 0.0F, -1.5F, 0.0F, 6, 2, 0, 0.0F, true));

        this.spine4 = new AdvancedModelRenderer(this);
        this.spine4.setRotationPoint(-1.0F, -1.0F, -0.75F);
        this.body.addChild(spine4);
        this.setRotateAngle(spine4, 0.0F, 0.0F, 0.6545F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.25F, -0.25F, 0.0F);
        this.spine4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.1309F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 17, -7.0F, -1.5F, 0.0F, 7, 2, 0, 0.0F, false));

        this.spine19 = new AdvancedModelRenderer(this);
        this.spine19.setRotationPoint(1.0F, -1.0F, -0.75F);
        this.body.addChild(spine19);
        this.setRotateAngle(spine19, 0.0F, 0.0F, -0.6545F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.25F, -0.25F, 0.0F);
        this.spine19.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.1309F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 17, 0.0F, -1.5F, 0.0F, 7, 2, 0, 0.0F, true));

        this.spine13 = new AdvancedModelRenderer(this);
        this.spine13.setRotationPoint(-1.25F, -1.0F, -4.5F);
        this.body.addChild(spine13);
        this.setRotateAngle(spine13, -0.2471F, 0.8637F, -0.1284F);
        this.spine13.cubeList.add(new ModelBox(spine13, 13, 0, -0.5F, 0.0F, -4.75F, 1, 0, 5, 0.0F, false));

        this.spine20 = new AdvancedModelRenderer(this);
        this.spine20.setRotationPoint(1.25F, -1.0F, -4.5F);
        this.body.addChild(spine20);
        this.setRotateAngle(spine20, -0.2471F, -0.8637F, 0.1284F);
        this.spine20.cubeList.add(new ModelBox(spine20, 13, 0, -0.5F, 0.0F, -4.75F, 1, 0, 5, 0.0F, true));

        this.spine14 = new AdvancedModelRenderer(this);
        this.spine14.setRotationPoint(-0.5F, -1.0F, -4.5F);
        this.body.addChild(spine14);
        this.setRotateAngle(spine14, 0.0957F, 0.4348F, 0.029F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.spine14.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 0, -0.5F, 0.15F, -4.5F, 1, 0, 5, 0.0F, false));

        this.spine21 = new AdvancedModelRenderer(this);
        this.spine21.setRotationPoint(0.5F, -1.0F, -4.5F);
        this.body.addChild(spine21);
        this.setRotateAngle(spine21, 0.0957F, -0.4348F, -0.029F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.spine21.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 0, -0.5F, 0.15F, -4.5F, 1, 0, 5, 0.0F, true));

        this.spine22 = new AdvancedModelRenderer(this);
        this.spine22.setRotationPoint(1.0F, -0.5F, -4.5F);
        this.body.addChild(spine22);
        this.setRotateAngle(spine22, 0.1945F, -0.7404F, -0.0355F);
        this.spine22.cubeList.add(new ModelBox(spine22, 8, 6, -0.5F, -0.25F, -5.0F, 1, 0, 5, 0.0F, true));

        this.spine15 = new AdvancedModelRenderer(this);
        this.spine15.setRotationPoint(-1.0F, -0.5F, -4.5F);
        this.body.addChild(spine15);
        this.setRotateAngle(spine15, 0.1945F, 0.7404F, 0.0355F);
        this.spine15.cubeList.add(new ModelBox(spine15, 8, 6, -0.5F, -0.25F, -5.0F, 1, 0, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 10, 15, -1.0F, -1.5F, 0.25F, 2, 1, 4, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.spine5 = new AdvancedModelRenderer(this);
        this.spine5.setRotationPoint(-1.0F, -1.0F, 0.5F);
        this.body2.addChild(spine5);
        this.setRotateAngle(spine5, 0.0F, 0.0F, 0.6545F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.spine5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 15, -6.75F, -1.75F, 1.75F, 7, 2, 0, 0.0F, false));

        this.spine23 = new AdvancedModelRenderer(this);
        this.spine23.setRotationPoint(1.0F, -1.0F, 0.5F);
        this.body2.addChild(spine23);
        this.setRotateAngle(spine23, 0.0F, 0.0F, -0.6545F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.spine23.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 18, 15, -0.25F, -1.75F, 1.75F, 7, 2, 0, 0.0F, true));

        this.spine6 = new AdvancedModelRenderer(this);
        this.spine6.setRotationPoint(-1.0F, -1.0F, 1.75F);
        this.body2.addChild(spine6);
        this.setRotateAngle(spine6, 0.0F, 0.0F, 0.6545F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.spine6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.0F, -0.1309F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 10, -6.75F, -1.75F, 1.75F, 7, 2, 0, 0.0F, false));

        this.spine24 = new AdvancedModelRenderer(this);
        this.spine24.setRotationPoint(1.0F, -1.0F, 1.75F);
        this.body2.addChild(spine24);
        this.setRotateAngle(spine24, 0.0F, 0.0F, -0.6545F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.spine24.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, 0.1309F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 10, -0.25F, -1.75F, 1.75F, 7, 2, 0, 0.0F, true));

        this.spine7 = new AdvancedModelRenderer(this);
        this.spine7.setRotationPoint(-1.0F, -1.0F, 3.0F);
        this.body2.addChild(spine7);
        this.setRotateAngle(spine7, 0.0F, 0.0F, 0.6545F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.spine7.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, -0.3054F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 2, -5.75F, -1.75F, 1.75F, 6, 2, 0, 0.0F, false));

        this.spine25 = new AdvancedModelRenderer(this);
        this.spine25.setRotationPoint(1.0F, -1.0F, 3.0F);
        this.body2.addChild(spine25);
        this.setRotateAngle(spine25, 0.0F, 0.0F, -0.6545F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, -1.75F);
        this.spine25.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.3054F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 2, -0.25F, -1.75F, 1.75F, 6, 2, 0, 0.0F, true));

        this.spine8 = new AdvancedModelRenderer(this);
        this.spine8.setRotationPoint(-1.0F, -1.0F, 4.25F);
        this.body2.addChild(spine8);
        this.setRotateAngle(spine8, 0.0F, 0.2182F, 0.4363F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.spine8.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.0873F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 20, -5.75F, -1.5F, 0.5F, 6, 2, 0, 0.0F, false));

        this.spine26 = new AdvancedModelRenderer(this);
        this.spine26.setRotationPoint(1.0F, -1.0F, 4.25F);
        this.body2.addChild(spine26);
        this.setRotateAngle(spine26, 0.0F, -0.2182F, -0.4363F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.spine26.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, 0.0873F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 20, -0.25F, -1.5F, 0.5F, 6, 2, 0, 0.0F, true));

        this.spine9 = new AdvancedModelRenderer(this);
        this.spine9.setRotationPoint(-1.0F, -1.0F, 4.25F);
        this.body2.addChild(spine9);
        this.setRotateAngle(spine9, 0.4887F, -0.538F, -0.1893F);


        this.spine27 = new AdvancedModelRenderer(this);
        this.spine27.setRotationPoint(1.0F, -1.0F, 4.25F);
        this.body2.addChild(spine27);
        this.setRotateAngle(spine27, 0.4887F, 0.538F, 0.1893F);


        this.spine10 = new AdvancedModelRenderer(this);
        this.spine10.setRotationPoint(-1.0F, -1.0F, 4.25F);
        this.body2.addChild(spine10);
        this.setRotateAngle(spine10, -0.093F, -0.3918F, 0.0204F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.0F, -1.25F);
        this.spine10.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 6, 0.0F, 0.05F, 1.25F, 1, 0, 5, 0.0F, false));

        this.spine28 = new AdvancedModelRenderer(this);
        this.spine28.setRotationPoint(1.0F, -1.0F, 4.25F);
        this.body2.addChild(spine28);
        this.setRotateAngle(spine28, -0.0948F, 0.4353F, -0.0249F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 0.0F, -1.25F);
        this.spine28.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 6, 6, -1.0F, 0.05F, 1.25F, 1, 0, 5, 0.0F, true));

        this.spine11 = new AdvancedModelRenderer(this);
        this.spine11.setRotationPoint(-0.5F, -1.0F, 4.25F);
        this.body2.addChild(spine11);
        this.setRotateAngle(spine11, 0.3568F, -0.2048F, -0.0757F);


        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine11.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 10, 6, -0.5F, 0.0F, 0.0F, 1, 0, 6, 0.0F, false));

        this.spine29 = new AdvancedModelRenderer(this);
        this.spine29.setRotationPoint(0.5F, -1.0F, 4.25F);
        this.body2.addChild(spine29);
        this.setRotateAngle(spine29, 0.3568F, 0.2048F, 0.0757F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spine29.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0873F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 10, 6, -0.5F, 0.0F, 0.0F, 1, 0, 6, 0.0F, true));

        this.spine16 = new AdvancedModelRenderer(this);
        this.spine16.setRotationPoint(-0.5F, -1.0F, 4.25F);
        this.body2.addChild(spine16);
        this.setRotateAngle(spine16, -0.1309F, -0.1309F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(1.5F, 0.0F, -1.25F);
        this.spine16.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 0, -2.0F, 0.2F, 1.25F, 1, 0, 6, 0.0F, false));

        this.spine30 = new AdvancedModelRenderer(this);
        this.spine30.setRotationPoint(0.5F, -1.0F, 4.25F);
        this.body2.addChild(spine30);
        this.setRotateAngle(spine30, -0.1309F, 0.1309F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.5F, 0.0F, -1.25F);
        this.spine30.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 10, 0, 1.0F, 0.2F, 1.25F, 1, 0, 6, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Orthozanclus.render(f5);
    }

    public void renderStaticDisplayCase(float f) {
        this.Orthozanclus.render(0.015F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Orthozanclus.rotateAngleY = (float) Math.toRadians(90);
        this.Orthozanclus.offsetY = 0.14F;
        this.Orthozanclus.render(0.015F);
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

        this.body.offsetY = 1.225F;

        EntityPrehistoricFloraOrthrozanclus ee = (EntityPrehistoricFloraOrthrozanclus) e;

        this.body.scaleChildren = false;
        float scaler = ((float)(((double)ee.getSlitherStage())/10D) * 0.125F) + 1F;
        this.body.setScaleZ(scaler);
        float scaler2 = 2F - (float)((((double)ee.getSlitherStage())/10D) * 0.125F);
        this.body.setScaleX(scaler2 * 0.5F);

        float moveWeight = 0.20F;
        float moveSpeed = 0.20F;

        //Left
        this.swing(spine21, moveSpeed, -moveWeight, false, 0, -moveWeight, f2, 0.8F);
        this.swing(spine22, moveSpeed, -moveWeight, false, 0.5F, -moveWeight, f2, 0.8F);
        this.swing(spine20, moveSpeed, -moveWeight, false, 1F, -moveWeight, f2, 0.8F);
        this.swing(spine30, moveSpeed, moveWeight, false, 1F, moveWeight, f2, 0.8F);
        this.swing(spine28, moveSpeed, moveWeight * 0.8F, false, 1F, moveWeight * 0.8F, f2, 0.8F);

        this.flap(spine12, moveSpeed, -moveWeight, false, 1F, -moveWeight, f2, 0.8F);
        this.flap(spine17, moveSpeed, -moveWeight, false, 1.25F, -moveWeight, f2, 0.8F);
        this.flap(spine18, moveSpeed, -moveWeight, false, 1.5F, -moveWeight, f2, 0.8F);
        this.flap(spine19, moveSpeed, -moveWeight, false, 1.75F, -moveWeight, f2, 0.8F);
        this.flap(spine23, moveSpeed, -moveWeight, false, 2.0F, -moveWeight, f2, 0.8F);
        this.flap(spine24, moveSpeed, -moveWeight, false, 2.25F, -moveWeight, f2, 0.8F);
        this.flap(spine25, moveSpeed, -moveWeight, false, 2.5F, -moveWeight, f2, 0.8F);
        this.flap(spine26, moveSpeed, -moveWeight, false, 2.75F, -moveWeight, f2, 0.8F);

        //Right
        this.swing(spine14, moveSpeed, moveWeight, false, 0, moveWeight, f2, 0.8F);
        this.swing(spine15, moveSpeed, moveWeight, false, 0.5F, moveWeight, f2, 0.8F);
        this.swing(spine13, moveSpeed, moveWeight, false, 1F, moveWeight, f2, 0.8F);
        this.swing(spine16, moveSpeed, -moveWeight, false, 1F, -moveWeight, f2, 0.8F);
        this.swing(spine10, moveSpeed, -moveWeight * 0.8F, false, 1F, -moveWeight * 0.8F, f2, 0.8F);

        this.flap(spine, moveSpeed, moveWeight, false, 1F, moveWeight, f2, 0.8F);
        this.flap(spine2, moveSpeed, moveWeight, false, 1.25F, moveWeight, f2, 0.8F);
        this.flap(spine3, moveSpeed, moveWeight, false, 1.5F, moveWeight, f2, 0.8F);
        this.flap(spine4, moveSpeed, moveWeight, false, 1.75F, moveWeight, f2, 0.8F);
        this.flap(spine5, moveSpeed, moveWeight, false, 2F, moveWeight, f2, 0.8F);
        this.flap(spine6, moveSpeed, moveWeight, false, 2.25F, moveWeight, f2, 0.8F);
        this.flap(spine7, moveSpeed, moveWeight, false, 2.5F, moveWeight, f2, 0.8F);
        this.flap(spine8, moveSpeed, moveWeight, false, 2.75F, moveWeight, f2, 0.8F);


        this.walk(spine11, moveSpeed, moveWeight, false, 0F, moveWeight, f2, 0.8F);
        this.walk(spine29, moveSpeed, moveWeight, false, 0F, moveWeight, f2, 0.8F);

        this.walk(spine10, moveSpeed, moveWeight * 0.8F, false, 0F, moveWeight * 0.8F, f2, 0.8F);
        this.walk(spine28, moveSpeed, moveWeight * 0.8F, false, 0F, moveWeight * 0.8F, f2, 0.8F);

    }
}
