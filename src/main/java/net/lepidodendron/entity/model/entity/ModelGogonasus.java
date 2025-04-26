package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGogonasus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r21;

    public ModelGogonasus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.5F, -2.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -3.0F, -3.5F, 5, 4, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 11, -2.0F, 0.5F, -3.5F, 4, 1, 7, -0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.0F, 1.5F, -1.5F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0F, 0.0F, -0.2618F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontleftfin.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.2618F, 0.6981F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 23, -0.15F, -0.325F, -2.35F, 6, 0, 3, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 24, -1.65F, -0.825F, -2.35F, 3, 1, 2, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.0F, 1.5F, -1.5F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.2618F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.frontrightfin.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, -0.6981F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 23, -5.85F, -0.325F, -2.35F, 6, 0, 3, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 24, -1.35F, -0.825F, -2.35F, 3, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 5.5F, 2.5F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 17, 0, -2.0F, -8.0F, -10.0F, 4, 3, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 24, -1.5F, -8.0F, -14.0F, 3, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -7.0F, -10.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.1047F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 7, 0.4F, 0.25F, -4.0F, 0, 1, 4, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 36, 0.0F, -1.0F, -4.0F, 1, 2, 4, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, -7.0F, -10.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1047F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 7, -0.4F, 0.25F, -4.0F, 0, 1, 4, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 36, -1.0F, -1.0F, -4.0F, 1, 2, 4, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.4155F, -8.0F, -12.4523F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0832F, -0.0637F, 0.9189F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 38, -0.2F, -0.325F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.4155F, -8.0F, -12.4523F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0832F, 0.0637F, -0.9189F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 38, -0.8F, -0.325F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -8.5F, -9.925F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1004F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 26, -1.5F, 0.0595F, -4.0141F, 3, 1, 4, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -8.5F, -5.75F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0175F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 3, -1.5F, -0.0134F, -4.1885F, 3, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.5F, -6.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0829F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 13, -1.5F, -1.6F, -4.05F, 3, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.4312F, -6.0085F, -10.0131F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 30, -1.9312F, 0.0085F, -3.9869F, 3, 1, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.4312F, -0.9915F, 0.0131F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1047F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 9, 0.5F, 0.75F, -4.0F, 0, 1, 4, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 8, 0.0F, 1.0F, -4.0F, 1, 1, 4, -0.001F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5688F, -0.9915F, 0.0131F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1047F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 15, 9, -0.5F, 0.75F, -4.0F, 0, 1, 4, 0.0F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 8, -1.0F, 1.0F, -4.0F, 1, 1, 4, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.5688F, 2.0085F, 0.0131F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.1178F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 32, -3.0F, -1.475F, -4.0F, 2, 1, 4, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.05F, 3.47F);
        this.main.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 17, 14, -2.0F, -1.45F, 0.03F, 4, 4, 5, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.95F, 0.03F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0436F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 19, 7, -1.5F, 1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.7786F, 1.8837F, 3.6795F);
        this.body.addChild(backleftfin);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.2618F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.2214F, -0.1282F, -0.248F);
        this.backleftfin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.3491F, 0.829F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 0, 0.0F, 0.225F, -1.0F, 5, 0, 3, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.7786F, 1.8837F, 3.6795F);
        this.body.addChild(backrightfin);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.2618F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.2214F, -0.1282F, -0.248F);
        this.backrightfin.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.3491F, -0.829F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 26, 0, -5.0F, 0.225F, -1.0F, 5, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.1039F, 4.7516F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 22, 23, -1.5F, 0.1539F, 0.2785F, 3, 3, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.6539F, 0.2785F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1134F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 35, -1.0F, -1.05F, 0.0F, 2, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.4542F, 0.8045F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.8858F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -2.5912F, 0.4067F, 0, 4, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 14, -0.5F, 0.4088F, 0.4067F, 1, 1, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.5961F, 0.2785F);
        this.tail.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1876F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 19, -1.0F, 1.05F, -0.05F, 2, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.5773F, 4.18F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 31, 30, -1.0F, -0.9234F, 0.0984F, 2, 2, 4, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -2.4234F, 0.5984F);
        this.tail2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.48F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 26, 28, 0.0F, 1.325F, -0.825F, 0, 2, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 1.5766F, 1.0984F);
        this.tail2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.9163F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 26, 0.0F, -1.275F, -0.1F, 0, 2, 4, 0.0F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -0.5F, -0.275F, -1.1F, 1, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.5438F, 4.0826F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 12, 0.0F, -1.3046F, -0.0842F, 0, 5, 7, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -0.3796F, 0.0158F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2618F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 30, -0.5F, 0.075F, -1.0F, 1, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.03F;
        this.main.offsetY = -0.21F;
        this.main.offsetZ = 0.07F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(tail, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3927F, 0.0F);
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetX = -0.F;
        this.main.offsetY = -0.F;
        this.main.offsetZ = 0.02F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.8F;
        this.main.offsetX = 0.4F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.2F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(frontrightfin, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(jaw, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(backleftfin, 0.0F, 0.0F, -0.2618F);
        this.setRotateAngle(backrightfin, 0.0F, 0.0F, 0.2618F);
        this.setRotateAngle(tail, 0.0F, 0.1309F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3927F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.35F;
        if (!e.isInWater()) {
            speed = 0.6F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            if(e.isInWater()) {
                this.swing(main, speed*0.75F, 0.2F, true, 0, 0, f2, 1);
            }
            this.walk(jaw, (float) (speed * 0.75), (float)Math.toRadians(10), true, 0, -0.2F, f2, 1);
            this.walk(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(backrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
            }
        }
    }
}
