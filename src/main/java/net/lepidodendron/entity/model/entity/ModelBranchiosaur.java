package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraBranchiosaur;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelBranchiosaur extends AdvancedModelBase {
    private final AdvancedModelRenderer Branchiosaurus;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer frontrightleg3;
    private final AdvancedModelRenderer frontrightleg4;
    private final AdvancedModelRenderer frontrighthand;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg5;
    private final AdvancedModelRenderer frontlefthand;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer lowerbody;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer backrightleg5;
    private final AdvancedModelRenderer backrightleg6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;

    public ModelBranchiosaur() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Branchiosaurus = new AdvancedModelRenderer(this);
        this.Branchiosaurus.setRotationPoint(-1.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Branchiosaurus.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -4.0F, -9.0F, 6, 4, 8, 0.0F, false));

        this.frontrightleg3 = new AdvancedModelRenderer(this);
        this.frontrightleg3.setRotationPoint(-1.5F, -1.25F, -6.5F);
        this.body.addChild(frontrightleg3);
        this.setRotateAngle(frontrightleg3, -0.0276F, 0.6092F, -0.1448F);
        this.frontrightleg3.cubeList.add(new ModelBox(frontrightleg3, 39, 39, -3.5F, -1.0F, -1.0F, 4, 2, 2, 0.01F, true));

        this.frontrightleg4 = new AdvancedModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-2.25F, 0.0F, 0.0F);
        this.frontrightleg3.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.0F, -1.1781F, 0.0F);
        this.frontrightleg4.cubeList.add(new ModelBox(frontrightleg4, 22, 41, -2.7519F, -1.0F, -1.0436F, 3, 2, 2, 0.0F, true));

        this.frontrighthand = new AdvancedModelRenderer(this);
        this.frontrighthand.setRotationPoint(-2.5019F, 0.25F, -0.0436F);
        this.frontrightleg4.addChild(frontrighthand);
        this.setRotateAngle(frontrighthand, 0.0F, -0.7854F, 0.0F);
        this.frontrighthand.cubeList.add(new ModelBox(frontrighthand, 39, 12, -2.7106F, -0.4004F, -1.1266F, 3, 1, 2, 0.0F, true));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(3.5F, -1.25F, -6.5F);
        this.body.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, -0.0276F, -0.6092F, 0.1448F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 39, 39, -0.5F, -1.0F, -1.0F, 4, 2, 2, 0.01F, false));

        this.frontleftleg5 = new AdvancedModelRenderer(this);
        this.frontleftleg5.setRotationPoint(2.25F, 0.0F, 0.0F);
        this.frontleftleg.addChild(frontleftleg5);
        this.setRotateAngle(frontleftleg5, 0.0F, 0.8727F, 0.0F);
        this.frontleftleg5.cubeList.add(new ModelBox(frontleftleg5, 22, 41, -0.2481F, -1.0F, -1.0436F, 3, 2, 2, 0.0F, false));

        this.frontlefthand = new AdvancedModelRenderer(this);
        this.frontlefthand.setRotationPoint(2.5019F, 0.25F, -0.0436F);
        this.frontleftleg5.addChild(frontlefthand);
        this.setRotateAngle(frontlefthand, 0.0F, 0.829F, 0.0F);
        this.frontlefthand.cubeList.add(new ModelBox(frontlefthand, 39, 12, -0.2894F, -0.4004F, -1.1266F, 3, 1, 2, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -3.0F, -8.0F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 31, -2.5F, -1.0F, -2.0F, 7, 4, 2, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.5F, 1.0F, -1.0F);
        this.neck.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 12, -2.5F, -2.0F, -0.25F, 3, 4, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(4.5F, 1.0F, -1.0F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 0, -0.5F, -2.0F, -0.25F, 3, 4, 0, 0.0F, false));

        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(1.0F, 1.75F, -2.0F);
        this.neck.addChild(lowerjaw);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 17, 12, -4.5F, 0.0F, -3.0F, 9, 1, 3, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 14, 33, -2.5F, 0.0F, -6.6F, 5, 1, 4, 0.015F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.75F, 0.0F);
        this.lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 0, -2.5F, -0.5F, -6.0F, 5, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.5F, -1.0F, -3.0F);
        this.lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.48F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 36, 34, 0.0507F, 0.99F, -4.0463F, 2, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.5F, -1.0F, -3.0F);
        this.lowerjaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.48F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 38, -2.0507F, 0.99F, -4.0463F, 2, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(1.0F, 1.75F, -2.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 28, 7, -4.5F, -3.0F, -1.0F, 9, 3, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 18, 17, -2.5F, -2.0F, -6.6F, 5, 2, 6, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 25, -4.5F, -2.0F, -3.0F, 9, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-4.5F, -1.0F, -3.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 37, 0.0507F, -1.01F, -4.0463F, 2, 2, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.8449F, -2.01F, -4.4454F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1692F, -0.22F, 0.0193F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 16, -0.25F, -0.34F, -0.25F, 1, 1, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.8449F, -2.01F, -4.4454F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1692F, 0.22F, -0.0193F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 17, 16, -0.75F, -0.34F, -0.25F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(4.5F, -1.0F, -3.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.48F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 23, -2.0507F, -1.01F, -4.0463F, 2, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.7322F, -3.9005F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 19, -2.5F, 0.1131F, -2.0893F, 5, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 16, -3.5F, 0.0F, -2.0F, 7, 1, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(1.0F, -3.0F, -1.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -2.5F, -1.0F, -1.0F, 5, 4, 7, -0.01F, false));

        this.lowerbody = new AdvancedModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, 1.6667F, 5.8333F);
        this.body2.addChild(lowerbody);
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 17, 25, -2.0F, -2.1667F, -0.8333F, 4, 3, 5, 0.0F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 0, 0, 0.0F, -4.1667F, 0.1667F, 0, 2, 4, 0.0F, false));
        this.lowerbody.cubeList.add(new ModelBox(lowerbody, 0, 1, 0.0F, 0.3333F, 0.1667F, 0, 1, 4, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(2.0F, -0.1667F, 1.1667F);
        this.lowerbody.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.0571F, -0.2581F, 0.1333F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 37, 29, -1.0F, -1.0F, -1.0F, 4, 2, 2, -0.01F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(2.5F, 0.0F, 0.25F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.0F, -0.6545F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 0, 0.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(2.0F, 0.0F, 0.25F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.0178F, -0.3487F, 0.1337F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 36, 0, -1.0F, -0.25F, -1.5F, 4, 1, 3, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(-2.0F, -0.1667F, 1.1667F);
        this.lowerbody.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.0658F, 0.3919F, -0.1694F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 37, 29, -3.0F, -1.0F, -1.0F, 4, 2, 2, -0.01F, true));

        this.backrightleg5 = new AdvancedModelRenderer(this);
        this.backrightleg5.setRotationPoint(-2.5F, 0.0F, 0.25F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, 0.0F, 0.5672F, 0.0F);
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 0, 0, -2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.backrightleg6 = new AdvancedModelRenderer(this);
        this.backrightleg6.setRotationPoint(-2.0F, 0.0F, 0.25F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, -0.0189F, 0.3054F, -0.1402F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 36, 0, -3.0F, -0.25F, -1.5F, 4, 1, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.9167F, 4.0F);
        this.lowerbody.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 27, 34, -1.0F, -0.75F, -0.8333F, 2, 2, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 1, 0.0F, 1.0F, 0.1667F, 0, 1, 4, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 0, 2, 0.0F, -2.75F, 0.1667F, 0, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 4.0667F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 28, 26, -0.5F, -0.5F, -0.9F, 1, 1, 7, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 2, 43, 0.0F, 0.25F, 0.1F, 0, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 3, 44, 0.0F, 0.25F, 4.1F, 0, 1, 2, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 43, 0.0F, -1.0F, 6.1F, 0, 2, 2, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 17, 0.0F, -2.5F, 0.1F, 0, 2, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Branchiosaurus.render(f5 * 0.20f);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Branchiosaurus.render(0.1F);
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
        this.Branchiosaurus.offsetY = 1.15F; //72

        EntityPrehistoricFloraBranchiosaur Branchiosaur = (EntityPrehistoricFloraBranchiosaur) e;

        this.faceTarget(f3, f4, 8, neck);

        float speed = 0.2F;
        AdvancedModelRenderer[] Tail = {this.tail, this.tail2};
        AdvancedModelRenderer[] Torso = {this.neck, this.body, this.body2, this.lowerbody};

        if (!Branchiosaur.isReallyInWater()) { //walk on land
            if (f3 == 0.0F) {
                return;
            }
            ////this.flap(Leftthigh, speed, 0.65F, false, -3, -0.35F, f2, 0.5F);
            this.flap(backleftleg, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
            ////this.swing(Leftthigh, speed, -0.3F, true, -1, 0.25F, f2, 0.5F);
            this.swing(backleftleg, speed, -0.5F, true, -1, 1F, f2, 0.5F);
            this.walk(backleftleg2, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
            //this.flap(Lefthindfoot, speed, 0.5F, false, 3, 0.4F, f2, 0.3F);
            //this.walk(Lefthindfoot, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);
            //this.swing(Lefthindfoot, speed, 0.4F, false, 3, 0F, f2, 0.5F);
            this.flap(backleftleg3, speed, 0.5F, false, 0, 0.4F, f2, 0.3F);
            this.walk(backleftleg3, speed, 0.8F, false, 0, 0.4F, f2, 0.5F);
            this.swing(backleftleg3, speed, 0.4F, false, 0, 0F, f2, 0.5F);

            ////this.flap(Rightthigh, speed, -0.65F, false, 0, 0.35F, f2, 0.5F);
            this.flap(backrightleg4, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
            ////this.swing(Rightthigh, speed, 0.3F, true, 2, -0.25F, f2, 0.5F);
            this.swing(backrightleg4, speed, 0.5F, true, 2, -1F, f2, 0.5F);
            this.walk(backrightleg5, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
            //this.flap(Righthindfoot, speed, -0.5F, false, 6, -0.4F, f2, 0.3F);
            //this.walk(Righthindfoot, speed, 0.8F, false, 6, 0.4F, f2, 0.5F);
            //this.swing(Righthindfoot, speed, -0.4F, false, 6, 0F, f2, 0.5F);
            this.flap(backrightleg6, speed, -0.5F, false, 3, -0.4F, f2, 0.3F);
            this.walk(backrightleg6, speed, 0.8F, false, 3, 0.4F, f2, 0.5F);
            this.swing(backrightleg6, speed, -0.4F, false, 3, 0F, f2, 0.5F);

            this.flap(frontleftleg, speed, 0.35F, false, 0, -0.18F, f2, 0.5F);
            this.swing(frontleftleg, speed, -0.25F, true, 2, 0.1F, f2, 0.5F);
            this.walk(frontleftleg5, speed, -0.4F, true, 0, 0.0F, f2, 0.8F);
            //this.flap(Leftfrontfoot, speed, 0.25F, true, 6, 0.2F, f2, 0.3F);
            //this.walk(Leftfrontfoot, speed, 0.25F, true, 6, 0.2F, f2, 0.3F);
            //this.swing(Leftfrontfoot, speed, 0.15F, true, 6, 0F, f2, 0.3F);
            this.flap(frontlefthand, speed, 0.4F, false, -3, 0.4F, f2, 0.3F);
            this.walk(frontlefthand, speed, 0.6F, false, -3, 0.4F, f2, 0.5F);
            this.swing(frontlefthand, speed, 0.4F, false, -3, 0F, f2, 0.5F);

            this.flap(frontrightleg3, speed, -0.35F, false, -3, 0.18F, f2, 0.5F);
            this.swing(frontrightleg3, speed, 0.25F, true, -1, -0.1F, f2, 0.5F);
            this.walk(frontrightleg4, speed, -0.4F, true, -3, 0.0F, f2, 0.8F);
            //this.flap(Rightfrontfoot, speed, -0.25F, true, 3, -0.2F, f2, 0.3F);
            //this.walk(Rightfrontfoot, speed, 0.25F, true, 3, 0.2F, f2, 0.3F);
            //this.swing(Rightfrontfoot, speed, -0.15F, true, 3, 0F, f2, 0.3F);
            this.flap(frontrighthand, speed, -0.6F, false, 0, -0.4F, f2, 0.3F);
            this.walk(frontrighthand, speed, 0.9F, false, 0, 0.4F, f2, 0.5F);
            this.swing(frontrighthand, speed, -0.5F, false, 0, 0F, f2, 0.5F);

            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed, 0.12F, -3, f2, 0.8F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
        }
        else {
            speed = speed * 2F;
            this.backleftleg3.rotateAngleX = (float) Math.toRadians(45);
            this.backrightleg6.rotateAngleX = (float) Math.toRadians(45);

            this.backleftleg.rotateAngleZ= (float) Math.toRadians(20);
            this.backleftleg2.rotateAngleZ= (float) Math.toRadians(-30);
            this.backleftleg.rotateAngleY= (float) Math.toRadians(-30);

            this.backleftleg.rotateAngleX = (float) Math.toRadians(20);


            this.backrightleg4.rotateAngleZ= (float) Math.toRadians(-20);
            this.backrightleg5.rotateAngleZ= (float) Math.toRadians(30);
            this.backrightleg4.rotateAngleY= (float) Math.toRadians(30);

            this.backrightleg4.rotateAngleX= (float) Math.toRadians(20);


            this.frontlefthand.rotateAngleX = (float) Math.toRadians(45);
            this.frontrighthand.rotateAngleX = (float) Math.toRadians(45);

            this.frontleftleg.rotateAngleZ= (float) Math.toRadians(20);

            this.frontleftleg.rotateAngleX = (float) Math.toRadians(20);


            this.frontrightleg3.rotateAngleZ= (float) Math.toRadians(-30);

            this.frontrightleg3.rotateAngleX = (float) Math.toRadians(20);


            this.frontleftleg5.rotateAngleY= (float) Math.toRadians(25);
            this.frontleftleg5.rotateAngleZ= (float) Math.toRadians(-25);
            this.frontrightleg4.rotateAngleY= (float) Math.toRadians(-25);
            this.frontrightleg4.rotateAngleZ= (float) Math.toRadians(25);

            AdvancedModelRenderer[] BackL = {this.backleftleg, this.backleftleg2, this.backleftleg3};
            AdvancedModelRenderer[] BackR = {this.backrightleg4, this.backrightleg5, this.backrightleg6};
            AdvancedModelRenderer[] FrontL = {this.frontleftleg, this.frontleftleg5, this.frontlefthand};
            AdvancedModelRenderer[] FrontR = {this.frontrightleg3, this.frontrightleg4, this.frontrighthand};

            this.chainWave(BackL, speed * 0.5F, 0.15F, -3, f2, 0.75F);
            this.chainWave(BackR, speed * 0.5F, 0.15F, 0, f2, 0.75F);
            this.chainWave(FrontL, speed * 0.5F, 0.17F, 0, f2, 1);
            this.chainWave(FrontR, speed * 0.5F, 0.17F, -3, f2, 1);

            this.chainWave(Tail, speed * 1.22F, 0.05F, -3, f2, 1);
            this.chainSwing(Tail, speed * 1.22F, 0.2F, -3, f2, 0.85F);
            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);

        }
    }

}
