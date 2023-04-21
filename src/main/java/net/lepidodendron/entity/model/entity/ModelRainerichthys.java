package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelRainerichthys extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer gills;
    private final AdvancedModelRenderer gills2;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer whorl;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    public ModelRainerichthys() {
        this.textureWidth = 50;
        this.textureHeight = 47;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(2.5F, 24.0F, 0.75F);


        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(-2.5F, -3.3865F, 0.7904F);
        this.root.addChild(main);
        this.main.cubeList.add(new ModelBox(main, 0, 15, -2.0F, -1.6135F, -0.7904F, 4, 4, 8, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 22, 11, -2.0F, -2.6135F, -4.7904F, 4, 5, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.7931F, -2.3189F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 35, -1.5F, -0.0081F, -3.0092F, 3, 2, 3, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.6135F, 7.2096F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, -1.05F, -10.0F, 3, 3, 10, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 3.3865F, -4.7904F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 20, -1.5F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.5F, 3.3865F, 7.2096F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 0, -4.0F, -2.0F, -8.05F, 3, 2, 8, -0.01F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(1.45F, -2.2635F, -4.1154F);
        this.main.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.0F, 0.0F, 1.0472F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 22, 36, -0.5F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));
        this.leftwing.cubeList.add(new ModelBox(leftwing, 28, 36, -0.5F, -9.0F, 0.0F, 1, 6, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -5.75F, 3.0F);
        this.leftwing.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 25, 0.0F, -3.175F, -2.7F, 0, 6, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.5F, 7.0F);
        this.leftwing.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.15F, -1.575F, -6.5F, 0, 2, 13, 0.0F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-1.45F, -2.2635F, -4.1154F);
        this.main.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, -1.0036F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 22, 36, -0.5F, -3.0F, 0.0F, 1, 3, 2, 0.0F, true));
        this.rightwing.cubeList.add(new ModelBox(rightwing, 28, 36, -0.5F, -9.0F, 0.0F, 1, 6, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -5.75F, 3.0F);
        this.rightwing.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 25, 0.0F, -3.175F, -2.7F, 0, 6, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.5F, 7.0F);
        this.rightwing.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.15F, -1.575F, -6.5F, 0, 2, 13, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -3.1587F, -4.8889F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 27, -1.5F, 1.0944F, -2.5135F, 3, 4, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 12, 36, -1.0F, 4.073F, -4.6018F, 2, 1, 3, 0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.75F, 4.908F, -3.0436F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3883F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.05F, -0.675F, -0.9F, 0, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 1.45F, -0.675F, -0.9F, 0, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.75F, 4.7818F, -4.0356F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.5498F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, 0.0F, -0.75F, -0.5F, 0, 1, 1, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 1, 1.5F, -0.75F, -0.5F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 3.6944F, -3.2635F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -1.0F, -1.15F, -1.225F, 2, 2, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.25F, -2.7F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.6109F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 4, -0.5F, 0.0026F, -1.9882F, 1, 2, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 26, -1.0F, -0.0056F, -2.9635F, 2, 2, 4, 0.0F, false));

        this.gills = new AdvancedModelRenderer(this);
        this.gills.setRotationPoint(2.3342F, 4.8859F, 1.4501F);
        this.head.addChild(gills);
        this.setRotateAngle(gills, -0.6117F, 0.327F, -0.3623F);
        this.gills.cubeList.add(new ModelBox(gills, 36, 43, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, false));

        this.gills2 = new AdvancedModelRenderer(this);
        this.gills2.setRotationPoint(-2.3342F, 4.8859F, 1.4501F);
        this.head.addChild(gills2);
        this.setRotateAngle(gills2, -0.6117F, -0.327F, 0.3623F);
        this.gills2.cubeList.add(new ModelBox(gills2, 36, 43, 0.0F, -1.0F, -1.0F, 0, 2, 2, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.2F, 2.8944F, -1.8135F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.3491F, 0.0F, 0.0F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 19, 0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 0, 8, -1.475F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-0.2F, 2.8944F, -1.8135F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.3491F, 0.0F, 0.0F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 19, -1.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 8, -1.525F, -0.5F, -0.5F, 3, 1, 1, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-1.0F, 5.1105F, 0.0902F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 35, 33, -0.5F, -0.1105F, -2.5402F, 3, 1, 3, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 27, 0.5F, -0.1105F, -4.5152F, 1, 1, 2, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.8895F, -2.0402F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1265F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 16, 0.5F, -0.75F, -1.85F, 1, 1, 4, -0.02F, false));

        this.whorl = new AdvancedModelRenderer(this);
        this.whorl.setRotationPoint(1.0F, -0.4105F, -4.0152F);
        this.jaw.addChild(whorl);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.whorl.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 7, 7, 0.0F, -0.225F, -0.65F, 0, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.whorl.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 7, 1, 0.025F, -0.225F, -0.45F, 0, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.whorl.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.5192F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 7, 0, -0.025F, -0.25F, -0.35F, 0, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.2492F, 7.1421F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 19, 22, -1.5F, -0.3643F, 0.0675F, 3, 3, 5, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -2.3643F, 0.3675F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4494F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 11, 0.0F, -3.9654F, -0.098F, 0, 4, 4, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 30, 0, -1.0F, 0.0346F, -0.098F, 2, 2, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 3.6357F, 0.0675F);
        this.tail.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1745F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 30, -1.0F, -1.15F, 0.0F, 2, 1, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.3F, 2.6357F, 1.5675F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -1.1345F);


        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.backleftfin.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1278F, -0.0283F, -0.2164F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 36, 0.125F, -0.5F, -0.5F, 0, 1, 10, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.backleftfin.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 40, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.3F, 2.6357F, 1.5675F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 1.1345F);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.backrightfin.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1278F, 0.0283F, 0.2164F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 36, -0.125F, -0.5F, -0.5F, 0, 1, 10, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.backrightfin.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2182F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 40, 0.0F, 0.0F, 0.0F, 0, 4, 3, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.1357F, 5.0675F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 34, 7, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.5F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -1.5F, -0.5F, 0, 3, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.root.offsetY = 1.1F;

        AdvancedModelRenderer[] finLeft = {this.leftwing};
        AdvancedModelRenderer[] finRight = {this.rightwing};
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            if (f3 != 0 || !(e.isInWater())) {
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.5F, -3, f2, 1);
                this.swing(root, speed, 0.3F, true, 0, 0, f2, 1);
            }

            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(leftwing, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(leftwing, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finLeft, speed, -0.30F, -0.8, f2, 1);

            this.walk(rightwing, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(rightwing, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.chainFlap(finRight, speed, 0.30F, 0.8, f2, 1);

            this.walk(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

            this.walk(backrightfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), -0.2F, true, 3, 0, f2, 1);
            this.flap(backrightfin, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);

            if (!e.isInWater()) {
                this.root.rotateAngleZ = (float) Math.toRadians(90);
                //this.root.offsetY = 1.25F;
                this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
