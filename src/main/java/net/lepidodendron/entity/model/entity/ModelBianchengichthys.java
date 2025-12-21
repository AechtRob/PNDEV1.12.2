package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelBianchengichthys extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
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
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer frontrightfin;

    public ModelBianchengichthys() {
        this.textureWidth = 40;
        this.textureHeight = 40;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 23.5F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 7, -2.0F, -1.0F, -6.0F, 4, 1, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -0.5F, -6.0F, 4, 1, 5, -0.002F, false));
        this.main.cubeList.add(new ModelBox(main, 28, 19, -1.0F, -1.5752F, -6.9679F, 2, 1, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 5, 30, -0.5F, -1.0F, -7.8F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0556F, -0.5F, -6.9247F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.1257F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 17, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.001F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0556F, -0.5F, -6.9247F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.1257F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 17, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.2154F, -0.6459F, -6.0343F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3916F, -0.8576F, -0.4959F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 27, -0.1F, -0.525F, -2.1F, 1, 1, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.3F, -1.6343F, -3.5453F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0026F, 0.0975F, -0.4381F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 10, -1.0F, 0.0F, -2.6F, 1, 1, 5, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.5F, 0.0F, -6.0F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.1178F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 13, 0.05F, -1.0F, 0.0F, 1, 1, 4, 0.002F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.4503F, -0.5F, -6.0059F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.0603F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 7, 0.0F, -0.5F, 0.0F, 1, 1, 1, -0.002F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.4503F, -0.5F, -6.0059F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.4058F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 14, 0.0F, -0.5F, -1.0F, 1, 1, 1, -0.001F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.4503F, -0.5F, -6.0059F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.4058F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, -1.0F, -0.5F, -1.0F, 1, 1, 1, -0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.4503F, -0.5F, -6.0059F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.0603F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 7, -1.0F, -0.5F, 0.0F, 1, 1, 1, -0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.5F, 0.0F, -6.0F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.1178F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 13, -1.05F, -1.0F, 0.0F, 1, 1, 4, 0.002F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.5752F, -6.9679F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.6109F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 5, -0.5F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -2.1681F, -2.9476F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 30, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -1.5376F, -4.3144F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 27, -1.0F, -0.125F, -0.5F, 1, 1, 2, -0.001F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.2154F, -0.6459F, -6.0343F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.3916F, 0.8576F, 0.4959F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 27, -0.9F, -0.525F, -2.1F, 1, 1, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.3F, -1.6343F, -3.5453F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0026F, -0.0975F, 0.4381F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 10, 0.0F, 0.0F, -2.6F, 1, 1, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.5F, -1.6684F, -1.0672F);
        this.main.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 14, -2.0F, -0.125F, -5.0F, 3, 1, 5, 0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.1427F, -1.1737F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 15, 3, -1.5F, -0.5073F, -0.3263F, 3, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.5073F, -0.0763F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, -0.075F, 0.125F, 0, 1, 2, 0.0F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(0.9678F, 1.1927F, 0.4508F);
        this.tail.addChild(backleftfin);
        this.setRotateAngle(backleftfin, -0.3054F, 0.48F, 0.0F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 28, 22, 0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-0.9678F, 1.1927F, 0.4508F);
        this.tail.addChild(backrightfin);
        this.setRotateAngle(backrightfin, -0.3054F, -0.48F, 0.0F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 28, 22, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.4427F, 3.4237F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 21, -1.0F, -0.8F, 0.0F, 2, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 21, -1.0F, -0.2F, 0.0F, 2, 1, 4, -0.001F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.1F, 3.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 26, 0, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail3.addChild(tail4);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 0.5F, 0.0F);
        this.tail4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 12, 17, 0.5F, -0.75F, 0.0F, 0, 2, 5, 0.001F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 9, 25, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -0.025F, -6.0F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 23, 0, 0.0F, -0.5F, -1.65F, 1, 1, 1, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 22, 10, -1.0F, -0.5F, -1.0F, 3, 1, 1, 0.001F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.1268F, -0.1F, -5.5219F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, -0.1201F, -0.4205F, 0.2875F);
        this.frontleftfin.cubeList.add(new ModelBox(frontleftfin, 14, 0, 0.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.1268F, -0.1F, -5.5219F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, -0.1201F, 0.4205F, -0.2875F);
        this.frontrightfin.cubeList.add(new ModelBox(frontrightfin, 14, 0, -2.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -2.0F;
        this.main.offsetX = -0.4F;
        this.main.rotateAngleY = (float)Math.toRadians(242);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetZ = -0.24F;
        this.main.offsetY = -0.18F;
        this.main.offsetX = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, 0.0F, -1.1257F, 0.0F);
        this.setRotateAngle(cube_r10, 0.0F, -0.1178F, 0.0F);
        this.setRotateAngle(cube_r11, 0.6109F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.5672F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r14, 0.3916F, 0.8576F, 0.4959F);
        this.setRotateAngle(cube_r15, 0.0026F, -0.0975F, 0.4381F);
        this.setRotateAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r17, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r18, 0.4363F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 1.1257F, 0.0F);
        this.setRotateAngle(cube_r3, 0.3916F, -0.8576F, -0.4959F);
        this.setRotateAngle(cube_r4, 0.0026F, 0.0975F, -0.4381F);
        this.setRotateAngle(cube_r5, 0.0F, 0.1178F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -1.0603F, 0.0F);
        this.setRotateAngle(cube_r7, 0.0F, -0.4058F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0F, 0.4058F, 0.0F);
        this.setRotateAngle(cube_r9, 0.0F, 1.0603F, 0.0F);
        this.setRotateAngle(frontleftfin, -0.2721F, -0.3455F, 0.6892F);
        this.setRotateAngle(frontrightfin, -0.1026F, 0.4249F, -0.2447F);
        this.setRotateAngle(jaw, 0.4712F, 0.0F, 0.0F);
        this.setRotateAngle(main, -0.1716F, -0.3604F, 0.1026F);
        this.setRotateAngle(tail, 0.0F, -0.1353F, 0.0F);
        this.setRotateAngle(tail2, 0.144F, 0.24F, 0.0F);
        this.setRotateAngle(tail3, 0.1745F, 0.4145F, 0.0F);
        this.setRotateAngle(tail4, 0.0297F, 0.3128F, 0.1094F);
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);

            this.flap(frontleftfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(backleftfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(backrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(backrightfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(main, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = -0.1F;
                this.bob(main, -speed, 5F, false, f2, 1);
            }
        }
    }
}
