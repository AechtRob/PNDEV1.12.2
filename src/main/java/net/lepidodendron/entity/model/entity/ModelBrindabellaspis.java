package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBrindabellaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r23;

    public ModelBrindabellaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 26.0F, -3.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -7.3F, 3.0F, 5, 5, 6, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.8F, 9.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, 0.0F, -2.225F, -4.05F, 0, 5, 8, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.0F, -2.725F, 4.5F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -1.3526F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.0185F, 0.0175F, 0.1521F);
        this.frontleftfin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 29, 0.0F, -0.5F, -1.5F, 0, 5, 4, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, -2.725F, 4.5F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 1.3526F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0185F, 0.0175F, 0.1521F);
        this.frontrightfin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 29, 0.0F, -0.5F, -1.5F, 0, 5, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -4.7891F, 8.577F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 11, 24, -2.0F, -1.5109F, -0.077F, 4, 3, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.5109F, 1.923F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 27, -1.5F, 0.5F, -2.075F, 3, 1, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.4891F, 1.923F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 27, -1.5F, -1.45F, -2.0F, 3, 1, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.9893F, 1.0537F, 2.8891F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.3927F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.0586F, -0.2435F, 1.0339F);
        this.backleftfin.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.49F, 0.1925F, -0.8244F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 11, 0.0F, -0.4F, -1.0F, 0, 4, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.9893F, 1.0537F, 2.8891F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.3927F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0586F, -0.2435F, 1.0339F);
        this.backrightfin.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.49F, -0.1925F, 0.8244F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 11, 0.0F, -0.4F, -1.0F, 0, 4, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.3181F, 4.9824F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 20, -1.5F, -0.8928F, -1.0594F, 3, 2, 4, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.8072F, -0.0594F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2269F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 36, 7, -1.0F, -1.025F, 0.0F, 2, 1, 3, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6428F, 0.9406F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 35, 33, -1.0F, -0.475F, -1.05F, 2, 1, 3, 0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.021F, 2.8826F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 36, 37, -1.0F, -0.9138F, 0.058F, 2, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.5862F, 1.558F);
        this.tail3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.0F, 0.1F, -1.75F, 0, 2, 3, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 33, -0.5F, -0.9F, -1.55F, 1, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.6638F, -1.942F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 33, -0.5F, -0.475F, 1.95F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.2996F, 2.8504F);
        this.tail3.addChild(tail4);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.8718F, 7.8655F);
        this.tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 37, -0.5F, -0.5278F, -0.5893F, 1, 1, 3, 0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.1142F, 0.2076F);
        this.tail4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.0F, 0.4F, -0.525F, 0, 3, 11, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 6, -0.5F, -0.6F, -0.25F, 1, 1, 8, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.4639F, -5.2316F, -5.5063F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 17, 17, -2.9639F, -1.0184F, 2.5063F, 5, 2, 5, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 14, -2.4639F, 0.9316F, 4.0313F, 4, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 26, -1.4639F, -0.7684F, -3.1332F, 2, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 17, -0.9639F, -0.7684F, -4.1332F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 0.5361F, -0.7684F, -1.4832F, 1, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.4639F, -0.7684F, -1.4832F, 1, 1, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 15, 15, 1.1111F, -1.0684F, 2.5063F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 15, 15, -3.0389F, -1.0684F, 2.5063F, 1, 1, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4639F, -0.5184F, 5.0063F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 25, 7, -1.5F, -1.075F, 1.175F, 3, 2, 5, -0.02F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-2.4639F, -0.2684F, -1.4832F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.5061F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 18, 38, 0.0F, -0.5F, -3.0F, 1, 1, 3, 0.002F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.5361F, -0.2684F, -1.4832F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.5061F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 38, -1.0F, -0.5F, -3.0F, 1, 1, 3, 0.001F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.4639F, -0.5184F, 5.0063F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 14, -2.0F, -1.25F, -4.5F, 4, 1, 7, 0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.4639F, 0.4816F, 1.5063F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.3229F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 11, 32, -1.5F, -0.55F, -2.175F, 3, 1, 5, 0.001F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.4639F, 0.9816F, 9.0063F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.2618F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 16, 0, -2.0F, 1.575F, -4.5F, 4, 1, 2, 0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.4639F, 2.8566F, 5.9313F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.048F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 25, 0, -2.5F, -4.0353F, 0.004F, 5, 4, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-2.9639F, -0.2684F, 2.6063F);
        this.head.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1614F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 38, 0.0F, -0.5F, -3.1F, 1, 1, 3, 0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.0361F, -0.2684F, 2.6063F);
        this.head.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.1614F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 38, -1.0F, -0.5F, -3.1F, 1, 1, 3, 0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.4639F, 1.9816F, 4.0063F);
        this.head.addChild(jaw);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 27, 33, -1.0F, -0.725F, -3.65F, 2, 1, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.22F;
        this.main.offsetX = -0.1F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, -0.1309F, (float) Math.toRadians(90), 0.0F);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -1.3526F);
        this.setRotateAngle(cube_r2, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 1.3526F);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.134F, 0.2163F, 0.0289F);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(cube_r6, 0.49F, 0.1925F, -0.8244F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.3927F);
        this.setRotateAngle(cube_r7, 0.49F, -0.1925F, 0.8244F);
        this.setRotateAngle(tail2, 0.3124F, 0.2079F, 0.0666F);
        this.setRotateAngle(cube_r8, 0.2269F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.245F, -0.4317F, -0.0774F);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, -0.2123F, -0.3863F, -0.0528F);
        this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r15, 0.0F, -0.5061F, 0.0F);
        this.setRotateAngle(cube_r16, 0.0F, 0.5061F, 0.0F);
        this.setRotateAngle(cube_r17, 0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, -0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r19, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r20, -0.048F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r21, 0.0F, -0.1614F, 0.0F);
        this.setRotateAngle(cube_r22, 0.0F, 0.1614F, 0.0F);
        this.setRotateAngle(jaw, 0.48F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r23, -0.3491F, 0.0F, 0.0F);
        this.main.offsetY = -0.3F;
        this.main.offsetX = -0.1F;
        this.main.offsetZ = 0.02F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {

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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.walk(jaw, (float) (speed * 0.75), 0.2F, false, 0, 0.2F, f2, 1);
            this.walk(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.3F;
            }
                this.chainWave(fishTail, speed, 0.03F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.25F, -2, f2, 1);
                this.swing(main, speed, 0.1F, true, 0, 0, f2, 1);
            }

    }
}
