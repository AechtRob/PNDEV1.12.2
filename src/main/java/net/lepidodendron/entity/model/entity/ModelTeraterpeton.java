package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTeraterpeton;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTeraterpeton extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hip;
    private final AdvancedModelRenderer lowerbody;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backleftleg;
    private final AdvancedModelRenderer backleftleg2;
    private final AdvancedModelRenderer backleftleg3;
    private final AdvancedModelRenderer backrightleg4;
    private final AdvancedModelRenderer backrightleg5;
    private final AdvancedModelRenderer backrightleg6;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer frontrightleg4;
    private final AdvancedModelRenderer frontrightleg5;
    private final AdvancedModelRenderer frontrightleg6;
    private final AdvancedModelRenderer frontleftleg;
    private final AdvancedModelRenderer frontleftleg3;
    private final AdvancedModelRenderer frontleftleg7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eye;


    private ModelAnimator animator;

    public ModelTeraterpeton() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.hip = new AdvancedModelRenderer(this);
        this.hip.setRotationPoint(0.0F, 19.5F, 7.0F);


        this.lowerbody = new AdvancedModelRenderer(this);
        this.lowerbody.setRotationPoint(0.0F, -2.5F, -2.5F);
        this.hip.addChild(lowerbody);
        this.setRotateAngle(lowerbody, -0.3054F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerbody.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 28, 24, -2.0F, -1.0F, 0.0F, 4, 5, 4, 0.0F, false));

        this.backleftleg = new AdvancedModelRenderer(this);
        this.backleftleg.setRotationPoint(1.25F, 2.5F, 2.25F);
        this.lowerbody.addChild(backleftleg);
        this.setRotateAngle(backleftleg, 0.0F, 0.4363F, 0.0F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 24, 33, -0.4226F, -1.0F, -1.5937F, 4, 2, 3, 0.01F, false));

        this.backleftleg2 = new AdvancedModelRenderer(this);
        this.backleftleg2.setRotationPoint(2.6095F, 0.5F, -0.8793F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, 0.8727F, 0.0F, 0.0F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.01F, false));

        this.backleftleg3 = new AdvancedModelRenderer(this);
        this.backleftleg3.setRotationPoint(0.0F, 3.25F, -0.5F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, -0.5796F, -0.2711F, 0.3246F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 10, 33, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRenderer(this);
        this.backrightleg4.setRotationPoint(-1.25F, 2.5F, 2.25F);
        this.lowerbody.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, 0.0F, -0.4363F, 0.0F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 24, 33, -3.5774F, -1.0F, -1.5937F, 4, 2, 3, 0.01F, true));

        this.backrightleg5 = new AdvancedModelRenderer(this);
        this.backrightleg5.setRotationPoint(-2.6095F, 0.5F, -0.8793F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, 0.8727F, 0.0F, 0.0F);
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 0, 0, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.01F, true));

        this.backrightleg6 = new AdvancedModelRenderer(this);
        this.backrightleg6.setRotationPoint(0.0F, 3.25F, -0.5F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, -0.5796F, 0.2711F, -0.3246F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 10, 33, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.0F, 4.0F);
        this.lowerbody.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 18, 14, -1.5F, -0.25F, -1.0F, 3, 4, 6, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 26, 0, -1.0F, -1.0F, -1.0F, 2, 3, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.5F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1329F, 0.0F, 0.023F);
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 9, 0.0F, -0.99F, 0.0F, 1, 2, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.51F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1855F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 10, 24, -0.5F, -1.21F, -1.0F, 1, 1, 8, -0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.5F, -2.0F);
        this.hip.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.0F, -8.0F, 5, 6, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0436F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 14, -2.0F, -1.0F, -5.0F, 4, 6, 5, -0.01F, false));

        this.frontrightleg4 = new AdvancedModelRenderer(this);
        this.frontrightleg4.setRotationPoint(-1.4821F, 3.5F, -3.451F);
        this.body2.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.0F, 0.5236F, 0.0F);
        this.frontrightleg4.cubeList.add(new ModelBox(frontrightleg4, 0, 25, -4.7321F, -1.0F, -1.134F, 5, 2, 2, 0.0F, true));

        this.frontrightleg5 = new AdvancedModelRenderer(this);
        this.frontrightleg5.setRotationPoint(-3.7321F, -0.5F, -0.134F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, 0.0F, 0.0F, 0.3927F);
        this.frontrightleg5.cubeList.add(new ModelBox(frontrightleg5, 10, 38, -1.0F, 0.5F, -1.0F, 2, 3, 2, -0.01F, true));

        this.frontrightleg6 = new AdvancedModelRenderer(this);
        this.frontrightleg6.setRotationPoint(0.0F, 3.25F, -0.25F);
        this.frontrightleg5.addChild(frontrightleg6);
        this.setRotateAngle(frontrightleg6, -0.0436F, -0.0038F, -0.3925F);
        this.frontrightleg6.cubeList.add(new ModelBox(frontrightleg6, 34, 34, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, true));

        this.frontleftleg = new AdvancedModelRenderer(this);
        this.frontleftleg.setRotationPoint(1.4821F, 3.5F, -3.451F);
        this.body2.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, -0.5236F, 0.0F);
        this.frontleftleg.cubeList.add(new ModelBox(frontleftleg, 0, 25, -0.2679F, -1.0F, -1.134F, 5, 2, 2, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRenderer(this);
        this.frontleftleg3.setRotationPoint(3.7321F, -0.5F, -0.134F);
        this.frontleftleg.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.0F, 0.0F, -0.3927F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 10, 38, -1.0F, 0.5F, -1.0F, 2, 3, 2, -0.01F, false));

        this.frontleftleg7 = new AdvancedModelRenderer(this);
        this.frontleftleg7.setRotationPoint(0.0F, 3.25F, -0.25F);
        this.frontleftleg3.addChild(frontleftleg7);
        this.setRotateAngle(frontleftleg7, -0.0436F, 0.0038F, 0.3925F);
        this.frontleftleg7.cubeList.add(new ModelBox(frontleftleg7, 34, 34, -1.5F, 0.0F, -3.5F, 3, 1, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, -1.0F, -5.0F);
        this.body2.addChild(neck);
        this.setRotateAngle(neck, -0.3981F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 0, 29, -1.0F, 0.0F, -2.0F, 3, 4, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, 0.0F, -2.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 37, -1.0F, 0.0F, -3.0F, 2, 4, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.0804F, -3.2299F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.2618F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 36, 17, -1.5F, 0.0804F, -2.5201F, 3, 2, 3, 0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 2.2304F, -6.2701F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 47, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.001F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 35, 42, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.9008F, -6.3433F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1833F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 40, -0.5F, 0.0437F, -3.025F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.0804F, -2.5201F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 37, 0, -1.0F, 0.0F, -4.0F, 1, 1, 4, -0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.45F, 1.0804F, -2.5201F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0349F, -0.6109F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 53, 0.0F, 0.0067F, -1.9193F, 1, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.45F, 1.0804F, -2.5201F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0349F, 0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 49, 53, -1.0F, 0.0067F, -1.9193F, 1, 1, 2, -0.002F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0551F, 0.4588F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 20, 24, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 17, 48, -0.5F, 0.0F, -9.0F, 1, 1, 6, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 40, -1.5F, -1.47F, -1.1F, 3, 2, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 19, 40, -1.5F, -1.47F, -1.6F, 3, 2, 1, -0.02F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.75F, -2.25F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 9, -1.0F, -0.7275F, -0.2918F, 2, 1, 3, -0.02F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.5F, 0.5F, -3.0F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.5934F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 21, 57, 0.1F, -0.5F, -1.95F, 1, 1, 2, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.5F, 0.5F, -3.0F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.5934F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 21, 57, -1.1F, -0.5F, -1.95F, 1, 1, 2, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0F, 0.8304F, -1.3201F);
        this.head.addChild(eye);
        this.eye.cubeList.add(new ModelBox(eye, 40, 52, 0.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 40, 52, -1.65F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hip.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck.offsetZ = -0.07F;
        this.neck.offsetY = -0.0F;
        this.neck.offsetX = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(hip, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.3F, 0.2F, 0.0F);
        this.setRotateAngle(neck2, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerbody, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(frontleftleg, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(frontleftleg3, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(frontleftleg7, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(frontrightleg4, 0.8F, 0.8F, 0.3F);
        this.setRotateAngle(frontrightleg5, 0.0F, 0.0F, 0.8F);
        this.setRotateAngle(frontrightleg6, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(backleftleg, 0.0F, -0.5F, 0.05F);
        this.setRotateAngle(backleftleg2, 1.7F, 0.3F, 0.0F);
        this.setRotateAngle(backleftleg3, -1.0F, -0.3F, 0.6F);
        this.setRotateAngle(backrightleg4, 0.0F, -0.3F, -0.05F);
        this.setRotateAngle(backrightleg5, 1.2F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg6, -1.0F, 0.3F, -0.6F);
        this.hip.offsetY = -0.083F;
        this.hip.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hip.offsetY = -0.6F;
        this.hip.offsetX = -0.2F;
        this.hip.rotateAngleY = (float)Math.toRadians(130);
        this.hip.rotateAngleX = (float)Math.toRadians(0);
        this.hip.rotateAngleZ = (float)Math.toRadians(0);
        this.hip.scaleChildren = true;
        float scaler = 0.9F;
        this.hip.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(hip, 0.2F, 3.8F, -0.2F);
        this.setRotateAngle(body, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(body2, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(neck, -0.3F, 0.2F, 0.0F);
        this.setRotateAngle(neck2, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(head, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(lowerbody, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(frontleftleg, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(frontleftleg3, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(frontleftleg7, 0.0F, 0.0F, 0.5F);
        this.setRotateAngle(frontrightleg4, 0.8F, 0.8F, 0.3F);
        this.setRotateAngle(frontrightleg5, 0.0F, 0.0F, 0.8F);
        this.setRotateAngle(frontrightleg6, 0.0F, 0.0F, -0.5F);
        this.setRotateAngle(backleftleg, 0.0F, -0.5F, 0.05F);
        this.setRotateAngle(backleftleg2, 1.7F, 0.3F, 0.0F);
        this.setRotateAngle(backleftleg3, -1.0F, -0.3F, 0.6F);
        this.setRotateAngle(backrightleg4, 0.0F, -0.3F, -0.05F);
        this.setRotateAngle(backrightleg5, 1.2F, 0.0F, 0.0F);
        this.setRotateAngle(backrightleg6, -1.0F, 0.3F, -0.6F);
        //End of pose, now render the model:
        this.hip.render(f);
        //Reset rotations, positions and sizing:
        this.hip.setScale(1.0F, 1.0F, 1.0F);
        this.hip.scaleChildren = false;
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
        //this.resetToDefaultPose();

        EntityPrehistoricFloraTeraterpeton entityTeraterpeton = (EntityPrehistoricFloraTeraterpeton) e;

        this.faceTarget(f3, f4, 12, neck);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        entityTeraterpeton.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityTeraterpeton.getAnimation() == entityTeraterpeton.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        } else {
            if (!entityTeraterpeton.isReallyInWater()) {

                if (f3 == 0.0F || !entityTeraterpeton.getIsMoving()) {
                    if (entityTeraterpeton.getAnimation() != entityTeraterpeton.EAT_ANIMATION
                            && entityTeraterpeton.getAnimation() != entityTeraterpeton.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityTeraterpeton.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        this.eye.setScale(1,1,1);
        EntityPrehistoricFloraTeraterpeton ee = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        } else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            } else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeraterpeton entity = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 4.25 + (((tickAnim - 15) / 3) * (5-(4.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 18) / 12) * (0-(5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -11 + (((tickAnim - 15) / 3) * (-11.5-(-11)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -11.5 + (((tickAnim - 18) / 12) * (0-(-11.5)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 25 + (((tickAnim - 15) / 3) * (26.25-(25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 26.25 + (((tickAnim - 18) / 12) * (0-(26.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 0) / 15) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 15) * (0.3425-(1)));
            zz = 1 + (((tickAnim - 0) / 15) * (1-(1)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 1 + (((tickAnim - 15) / 3) * (1-(1)));
            yy = 0.3425 + (((tickAnim - 15) / 3) * (0.3711-(0.3425)));
            zz = 1 + (((tickAnim - 15) / 3) * (1-(1)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 1 + (((tickAnim - 18) / 12) * (1-(1)));
            yy = 0.3711 + (((tickAnim - 18) / 12) * (1-(0.3711)));
            zz = 1 + (((tickAnim - 18) / 12) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeraterpeton entity = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 19.75 + (((tickAnim - 9) / 6) * (23.5-(19.75)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 23.5 + (((tickAnim - 15) / 8) * (0-(23.5)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -14.25 + (((tickAnim - 9) / 6) * (-16.75-(-14.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -16.75 + (((tickAnim - 15) / 8) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.35-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0.35 + (((tickAnim - 9) / 6) * (0.45-(0.35)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0.45 + (((tickAnim - 15) / 8) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -14.25 + (((tickAnim - 9) / 6) * (-18.75-(-14.25)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = -18.75 + (((tickAnim - 15) / 8) * (0-(-18.75)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 17.5 + (((tickAnim - 9) / 6) * (25.59-(17.5)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 25.59 + (((tickAnim - 15) / 8) * (0-(25.59)));
            yy = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeraterpeton entity = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20.40463-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3.36608-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.60657-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 20.40463 + (((tickAnim - 7) / 4) * (11.65463-(20.40463)));
            yy = -3.36608 + (((tickAnim - 7) / 4) * (-3.36608-(-3.36608)));
            zz = -2.60657 + (((tickAnim - 7) / 4) * (-2.60657-(-2.60657)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 11.65463 + (((tickAnim - 11) / 4) * (0.40463-(11.65463)));
            yy = -3.36608 + (((tickAnim - 11) / 4) * (-3.36608-(-3.36608)));
            zz = -2.60657 + (((tickAnim - 11) / 4) * (-2.60657-(-2.60657)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0.40463 + (((tickAnim - 15) / 2) * (8.90463-(0.40463)));
            yy = -3.36608 + (((tickAnim - 15) / 2) * (-3.36608-(-3.36608)));
            zz = -2.60657 + (((tickAnim - 15) / 2) * (-2.60657-(-2.60657)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 8.90463 + (((tickAnim - 17) / 3) * (0-(8.90463)));
            yy = -3.36608 + (((tickAnim - 17) / 3) * (0-(-3.36608)));
            zz = -2.60657 + (((tickAnim - 17) / 3) * (0-(-2.60657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (8.90521-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-7.90779-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0.73406-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 8.90521 + (((tickAnim - 7) / 4) * (-11.34479-(8.90521)));
            yy = -7.90779 + (((tickAnim - 7) / 4) * (-7.90779-(-7.90779)));
            zz = 0.73406 + (((tickAnim - 7) / 4) * (0.73406-(0.73406)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11.34479 + (((tickAnim - 11) / 4) * (8.65521-(-11.34479)));
            yy = -7.90779 + (((tickAnim - 11) / 4) * (-7.90779-(-7.90779)));
            zz = 0.73406 + (((tickAnim - 11) / 4) * (0.73406-(0.73406)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 8.65521 + (((tickAnim - 15) / 2) * (-6.09479-(8.65521)));
            yy = -7.90779 + (((tickAnim - 15) / 2) * (-7.90779-(-7.90779)));
            zz = 0.73406 + (((tickAnim - 15) / 2) * (0.73406-(0.73406)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -6.09479 + (((tickAnim - 17) / 3) * (0-(-6.09479)));
            yy = -7.90779 + (((tickAnim - 17) / 3) * (0-(-7.90779)));
            zz = 0.73406 + (((tickAnim - 17) / 3) * (0-(0.73406)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (20.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -11.5 + (((tickAnim - 7) / 4) * (-11-(-11.5)));
            yy = 20.75 + (((tickAnim - 7) / 4) * (0-(20.75)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -11 + (((tickAnim - 11) / 4) * (-14.25-(-11)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = -14.25 + (((tickAnim - 15) / 2) * (-15.5-(-14.25)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15.5 + (((tickAnim - 17) / 3) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 10.5 + (((tickAnim - 7) / 2) * (0-(10.5)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (18.75-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 18.75 + (((tickAnim - 15) / 2) * (0-(18.75)));
            yy = 0 + (((tickAnim - 15) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeraterpeton entity = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (-2.1315-(0)));
            yy = 1.75 + (((tickAnim - 15) / 7) * (1.93678-(1.75)));
            zz = -3.25 + (((tickAnim - 15) / 7) * (-14.9266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*15-(-3.25)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -2.1315 + (((tickAnim - 22) / 7) * (0-(-2.1315)));
            yy = 1.93678 + (((tickAnim - 22) / 7) * (1.75-(1.93678)));
            zz = -14.9266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*15 + (((tickAnim - 22) / 7) * (-3.25-(-14.9266+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*15)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (-2.1315-(0)));
            yy = 1.75 + (((tickAnim - 29) / 7) * (1.93678-(1.75)));
            zz = -3.25 + (((tickAnim - 29) / 7) * (-0.1016-(-3.25)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -2.1315 + (((tickAnim - 36) / 14) * (0-(-2.1315)));
            yy = 1.93678 + (((tickAnim - 36) / 14) * (0-(1.93678)));
            zz = -0.1016 + (((tickAnim - 36) / 14) * (0-(-0.1016)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-9.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (-8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*15-(0)));
            yy = -9.25 + (((tickAnim - 15) / 7) * (-10.2564-(-9.25)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = -8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*15 + (((tickAnim - 22) / 7) * (0-(-8.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-70))*15)));
            yy = -10.2564 + (((tickAnim - 22) / 7) * (-9.25-(-10.2564)));
            zz = 0 + (((tickAnim - 22) / 7) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 29) / 7) * (-8.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15-(0)));
            yy = -9.25 + (((tickAnim - 29) / 7) * (-10.2564-(-9.25)));
            zz = 0 + (((tickAnim - 29) / 7) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = -8.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15 + (((tickAnim - 36) / 14) * (0-(-8.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-15)));
            yy = -10.2564 + (((tickAnim - 36) / 14) * (0-(-10.2564)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (3.92416-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (26.08675-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-19.78497-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 3.92416 + (((tickAnim - 7) / 8) * (4.62433-(3.92416)));
            yy = 26.08675 + (((tickAnim - 7) / 8) * (57.64602-(26.08675)));
            zz = -19.78497 + (((tickAnim - 7) / 8) * (9.88839-(-19.78497)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 4.62433 + (((tickAnim - 15) / 7) * (23.389-(4.62433)));
            yy = 57.64602 + (((tickAnim - 15) / 7) * (-11.90586-(57.64602)));
            zz = 9.88839 + (((tickAnim - 15) / 7) * (-21.34657-(9.88839)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 23.389 + (((tickAnim - 22) / 4) * (17.92076-(23.389)));
            yy = -11.90586 + (((tickAnim - 22) / 4) * (20.71271-(-11.90586)));
            zz = -21.34657 + (((tickAnim - 22) / 4) * (-20.51823-(-21.34657)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = 17.92076 + (((tickAnim - 26) / 3) * (4.62433-(17.92076)));
            yy = 20.71271 + (((tickAnim - 26) / 3) * (57.64602-(20.71271)));
            zz = -20.51823 + (((tickAnim - 26) / 3) * (9.88839-(-20.51823)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 4.62433 + (((tickAnim - 29) / 7) * (23.389-(4.62433)));
            yy = 57.64602 + (((tickAnim - 29) / 7) * (-11.90586-(57.64602)));
            zz = 9.88839 + (((tickAnim - 29) / 7) * (-21.34657-(9.88839)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 23.389 + (((tickAnim - 36) / 14) * (0-(23.389)));
            yy = -11.90586 + (((tickAnim - 36) / 14) * (0-(-11.90586)));
            zz = -21.34657 + (((tickAnim - 36) / 14) * (0-(-21.34657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.17517-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-6.02465-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-8.74991-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = -5.17517 + (((tickAnim - 7) / 8) * (-14-(-5.17517)));
            yy = -6.02465 + (((tickAnim - 7) / 8) * (-12-(-6.02465)));
            zz = -8.74991 + (((tickAnim - 7) / 8) * (0-(-8.74991)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -14 + (((tickAnim - 15) / 7) * (10.79743-(-14)));
            yy = -12 + (((tickAnim - 15) / 7) * (11.06602-(-12)));
            zz = 0 + (((tickAnim - 15) / 7) * (-5.69766-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 10.79743 + (((tickAnim - 22) / 7) * (-14-(10.79743)));
            yy = 11.06602 + (((tickAnim - 22) / 7) * (-12-(11.06602)));
            zz = -5.69766 + (((tickAnim - 22) / 7) * (0-(-5.69766)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = -14 + (((tickAnim - 29) / 7) * (10.79743-(-14)));
            yy = -12 + (((tickAnim - 29) / 7) * (11.06602-(-12)));
            zz = 0 + (((tickAnim - 29) / 7) * (-5.69766-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 10.79743 + (((tickAnim - 36) / 14) * (0-(10.79743)));
            yy = 11.06602 + (((tickAnim - 36) / 14) * (0-(11.06602)));
            zz = -5.69766 + (((tickAnim - 36) / 14) * (0-(-5.69766)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (40.07522-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-6.06122-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-2.76588-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 40.07522 + (((tickAnim - 7) / 8) * (14.68499-(40.07522)));
            yy = -6.06122 + (((tickAnim - 7) / 8) * (-14.07206-(-6.06122)));
            zz = -2.76588 + (((tickAnim - 7) / 8) * (-6.42141-(-2.76588)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 14.68499 + (((tickAnim - 15) / 7) * (52.8545-(14.68499)));
            yy = -14.07206 + (((tickAnim - 15) / 7) * (3.78411-(-14.07206)));
            zz = -6.42141 + (((tickAnim - 15) / 7) * (-2.62072-(-6.42141)));
        }
        else if (tickAnim >= 22 && tickAnim < 29) {
            xx = 52.8545 + (((tickAnim - 22) / 7) * (14.68499-(52.8545)));
            yy = 3.78411 + (((tickAnim - 22) / 7) * (-14.07206-(3.78411)));
            zz = -2.62072 + (((tickAnim - 22) / 7) * (-6.42141-(-2.62072)));
        }
        else if (tickAnim >= 29 && tickAnim < 36) {
            xx = 14.68499 + (((tickAnim - 29) / 7) * (52.8545-(14.68499)));
            yy = -14.07206 + (((tickAnim - 29) / 7) * (3.78411-(-14.07206)));
            zz = -6.42141 + (((tickAnim - 29) / 7) * (-2.62072-(-6.42141)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 52.8545 + (((tickAnim - 36) / 14) * (0-(52.8545)));
            yy = 3.78411 + (((tickAnim - 36) / 14) * (0-(3.78411)));
            zz = -2.62072 + (((tickAnim - 36) / 14) * (0-(-2.62072)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg7, frontleftleg7.rotateAngleX + (float) Math.toRadians(xx), frontleftleg7.rotateAngleY + (float) Math.toRadians(yy), frontleftleg7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 36) {
            xx = 4.5 + (((tickAnim - 15) / 21) * (4.5-(4.5)));
            yy = -11.75 + (((tickAnim - 15) / 21) * (-11.75-(-11.75)));
            zz = 0 + (((tickAnim - 15) / 21) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 4.5 + (((tickAnim - 36) / 14) * (0-(4.5)));
            yy = -11.75 + (((tickAnim - 36) / 14) * (0-(-11.75)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 15) / 21) * (0-(0)));
            yy = -11.25 + (((tickAnim - 15) / 21) * (-11.25-(-11.25)));
            zz = 0 + (((tickAnim - 15) / 21) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            yy = -11.25 + (((tickAnim - 36) / 14) * (0-(-11.25)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-7.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 36) {
            xx = 10.25 + (((tickAnim - 15) / 21) * (10.25-(10.25)));
            yy = -7.25 + (((tickAnim - 15) / 21) * (-7.25-(-7.25)));
            zz = 0 + (((tickAnim - 15) / 21) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 36) / 14) * (0-(10.25)));
            yy = -7.25 + (((tickAnim - 36) / 14) * (0-(-7.25)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeraterpeton entity = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 15) / 20) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 35) / 15) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(xx), hip.rotateAngleY + (float) Math.toRadians(yy), hip.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.85 + (((tickAnim - 15) / 20) * (-0.85-(-0.85)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.85 + (((tickAnim - 35) / 15) * (0-(-0.85)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(xx);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(yy);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(xx), lowerbody.rotateAngleY + (float) Math.toRadians(yy), lowerbody.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerbody.rotationPointX = this.lowerbody.rotationPointX + (float)(xx);
        this.lowerbody.rotationPointY = this.lowerbody.rotationPointY - (float)(yy);
        this.lowerbody.rotationPointZ = this.lowerbody.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.75 + (((tickAnim - 15) / 20) * (1.75-(1.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.75 + (((tickAnim - 35) / 15) * (0-(1.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 7.25 + (((tickAnim - 15) / 20) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 35) / 15) * (0-(7.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7.75 + (((tickAnim - 15) / 20) * (-7.75-(-7.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -7.75 + (((tickAnim - 35) / 15) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 3.5 + (((tickAnim - 15) / 20) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 35) / 15) * (0-(3.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 15) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTeraterpeton entity = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 4) / 4) * (6.25-(15)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 6.25 + (((tickAnim - 8) / 2) * (-4-(6.25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -4 + (((tickAnim - 10) / 5) * (0-(-4)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -5.75 + (((tickAnim - 4) / 4) * (-8.75-(-5.75)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -8.75 + (((tickAnim - 8) / 2) * (-4-(-8.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -4 + (((tickAnim - 10) / 5) * (0-(-4)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.25 + (((tickAnim - 4) / 4) * (-5-(-12.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 8) / 2) * (12.25-(-5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 12.25 + (((tickAnim - 10) / 5) * (0-(12.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 6.25 + (((tickAnim - 4) / 4) * (28-(6.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 28 + (((tickAnim - 8) / 2) * (0-(28)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeraterpeton entity = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;
        int animCycle = 11;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 8.73851 + (((tickAnim - 0) / 2) * (9.52415-(8.73851)));
            yy = -65.60494 + (((tickAnim - 0) / 2) * (-32.95535-(-65.60494)));
            zz = -15.43989 + (((tickAnim - 0) / 2) * (-29.9248-(-15.43989)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 9.52415 + (((tickAnim - 2) / 3) * (10.88754-(9.52415)));
            yy = -32.95535 + (((tickAnim - 2) / 3) * (14.50928-(-32.95535)));
            zz = -29.9248 + (((tickAnim - 2) / 3) * (17.26196-(-29.9248)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10.88754 + (((tickAnim - 5) / 3) * (4.78646-(10.88754)));
            yy = 14.50928 + (((tickAnim - 5) / 3) * (-17.18517-(14.50928)));
            zz = 17.26196 + (((tickAnim - 5) / 3) * (0.3107-(17.26196)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.78646 + (((tickAnim - 8) / 4) * (8.73851-(4.78646)));
            yy = -17.18517 + (((tickAnim - 8) / 4) * (-65.60494-(-17.18517)));
            zz = 0.3107 + (((tickAnim - 8) / 4) * (-15.43989-(0.3107)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.98572 + (((tickAnim - 0) / 3) * (-37.9379-(30.98572)));
            yy = 38.77594 + (((tickAnim - 0) / 3) * (9.28434-(38.77594)));
            zz = -8.33124 + (((tickAnim - 0) / 3) * (-49.52727-(-8.33124)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -37.9379 + (((tickAnim - 3) / 2) * (-34.12225-(-37.9379)));
            yy = 9.28434 + (((tickAnim - 3) / 2) * (-32.00112-(9.28434)));
            zz = -49.52727 + (((tickAnim - 3) / 2) * (-39.96811-(-49.52727)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -34.12225 + (((tickAnim - 5) / 7) * (30.98572-(-34.12225)));
            yy = -32.00112 + (((tickAnim - 5) / 7) * (38.77594-(-32.00112)));
            zz = -39.96811 + (((tickAnim - 5) / 7) * (-8.33124-(-39.96811)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 2) * (0-(0.7)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 71.5 + (((tickAnim - 0) / 2) * (75.25-(71.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 75.25 + (((tickAnim - 2) / 3) * (52-(75.25)));
            yy = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 52 + (((tickAnim - 5) / 3) * (-0.17015-(52)));
            yy = 0 + (((tickAnim - 5) / 3) * (14.44343-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (2.1045-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.17015 + (((tickAnim - 8) / 2) * (3.41493-(-0.17015)));
            yy = 14.44343 + (((tickAnim - 8) / 2) * (7.22171-(14.44343)));
            zz = 2.1045 + (((tickAnim - 8) / 2) * (1.05225-(2.1045)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 3.41493 + (((tickAnim - 10) / 2) * (71.5-(3.41493)));
            yy = 7.22171 + (((tickAnim - 10) / 2) * (0-(7.22171)));
            zz = 1.05225 + (((tickAnim - 10) / 2) * (0-(1.05225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 10.88754 + (((tickAnim - 0) / 6) * (8.73851-(10.88754)));
            yy = -14.5093 + (((tickAnim - 0) / 6) * (65.6049-(-14.5093)));
            zz = -17.262 + (((tickAnim - 0) / 6) * (15.4399-(-17.262)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.73851 + (((tickAnim - 6) / 2) * (3.38625-(8.73851)));
            yy = 65.6049 + (((tickAnim - 6) / 2) * (20.46823-(65.6049)));
            zz = 15.4399 + (((tickAnim - 6) / 2) * (24.23124-(15.4399)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 3.38625 + (((tickAnim - 8) / 3) * (1.90631-(3.38625)));
            yy = 20.46823 + (((tickAnim - 8) / 3) * (-9.70424-(20.46823)));
            zz = 24.23124 + (((tickAnim - 8) / 3) * (-3.3457-(24.23124)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 1.90631 + (((tickAnim - 11) / 1) * (10.88754-(1.90631)));
            yy = -9.70424 + (((tickAnim - 11) / 1) * (-14.5093-(-9.70424)));
            zz = -3.3457 + (((tickAnim - 11) / 1) * (-17.262-(-3.3457)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -34.12225 + (((tickAnim - 0) / 6) * (30.98572-(-34.12225)));
            yy = 32.0011 + (((tickAnim - 0) / 6) * (-38.7759-(32.0011)));
            zz = 39.9681 + (((tickAnim - 0) / 6) * (8.3312-(39.9681)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 30.98572 + (((tickAnim - 6) / 2) * (-6.1461-(30.98572)));
            yy = -38.7759 + (((tickAnim - 6) / 2) * (-20.05122-(-38.7759)));
            zz = 8.3312 + (((tickAnim - 6) / 2) * (22.34468-(8.3312)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -6.1461 + (((tickAnim - 8) / 3) * (-27.21415-(-6.1461)));
            yy = -20.05122 + (((tickAnim - 8) / 3) * (13.14825-(-20.05122)));
            zz = 22.34468 + (((tickAnim - 8) / 3) * (16.7025-(22.34468)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -27.21415 + (((tickAnim - 11) / 1) * (-34.12225-(-27.21415)));
            yy = 13.14825 + (((tickAnim - 11) / 1) * (32.0011-(13.14825)));
            zz = 16.7025 + (((tickAnim - 11) / 1) * (39.9681-(16.7025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg5, backrightleg5.rotateAngleX + (float) Math.toRadians(xx), backrightleg5.rotateAngleY + (float) Math.toRadians(yy), backrightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.75-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 8) / 3) * (0-(0.75)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg5.rotationPointX = this.backrightleg5.rotationPointX + (float)(xx);
        this.backrightleg5.rotationPointY = this.backrightleg5.rotationPointY - (float)(yy);
        this.backrightleg5.rotationPointZ = this.backrightleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 53.16877 + (((tickAnim - 0) / 2) * (10.52918-(53.16877)));
            yy = -8.71163 + (((tickAnim - 0) / 2) * (-5.80775-(-8.71163)));
            zz = 1.9285 + (((tickAnim - 0) / 2) * (1.28567-(1.9285)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 10.52918 + (((tickAnim - 2) / 2) * (5.73346-(10.52918)));
            yy = -5.80775 + (((tickAnim - 2) / 2) * (-5.8039-(-5.80775)));
            zz = 1.28567 + (((tickAnim - 2) / 2) * (1.28481-(1.28567)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 5.73346 + (((tickAnim - 4) / 2) * (71.5-(5.73346)));
            yy = -5.8039 + (((tickAnim - 4) / 2) * (0-(-5.8039)));
            zz = 1.28481 + (((tickAnim - 4) / 2) * (0-(1.28481)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 71.5 + (((tickAnim - 6) / 2) * (101.25-(71.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 101.25 + (((tickAnim - 8) / 0) * (34.28-(101.25)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 34.28 + (((tickAnim - 8) / 3) * (32-(34.28)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 32 + (((tickAnim - 11) / 1) * (53.16877-(32)));
            yy = 0 + (((tickAnim - 11) / 1) * (-8.71163-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (1.9285-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg6, backrightleg6.rotateAngleX + (float) Math.toRadians(xx), backrightleg6.rotateAngleY + (float) Math.toRadians(yy), backrightleg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18.58871 + (((tickAnim - 0) / 3) * (15.19105-(18.58871)));
            yy = 22.48917 + (((tickAnim - 0) / 3) * (-15.05951-(22.48917)));
            zz = 22.97601 + (((tickAnim - 0) / 3) * (31.42281-(22.97601)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 15.19105 + (((tickAnim - 3) / 3) * (0-(15.19105)));
            yy = -15.05951 + (((tickAnim - 3) / 3) * (-58.5-(-15.05951)));
            zz = 31.42281 + (((tickAnim - 3) / 3) * (0-(31.42281)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (4.69312-(0)));
            yy = -58.5 + (((tickAnim - 6) / 2) * (-9.32036-(-58.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (-1.97394-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.69312 + (((tickAnim - 8) / 4) * (18.58871-(4.69312)));
            yy = -9.32036 + (((tickAnim - 8) / 4) * (22.48917-(-9.32036)));
            zz = -1.97394 + (((tickAnim - 8) / 4) * (22.97601-(-1.97394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-4.178-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (7.25369-(0)));
            zz = 10.25 + (((tickAnim - 0) / 3) * (21.48826-(10.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -4.178 + (((tickAnim - 3) / 2) * (-23.64877-(-4.178)));
            yy = 7.25369 + (((tickAnim - 3) / 2) * (9.66081-(7.25369)));
            zz = 21.48826 + (((tickAnim - 3) / 2) * (7.88553-(21.48826)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -23.64877 + (((tickAnim - 5) / 1) * (-11.7767-(-23.64877)));
            yy = 9.66081 + (((tickAnim - 5) / 1) * (11.9047-(9.66081)));
            zz = 7.88553 + (((tickAnim - 5) / 1) * (3.14359-(7.88553)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -11.7767 + (((tickAnim - 6) / 6) * (0-(-11.7767)));
            yy = 11.9047 + (((tickAnim - 6) / 6) * (0-(11.9047)));
            zz = 3.14359 + (((tickAnim - 6) / 6) * (10.25-(3.14359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg5, frontrightleg5.rotateAngleX + (float) Math.toRadians(xx), frontrightleg5.rotateAngleY + (float) Math.toRadians(yy), frontrightleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 49.02077 + (((tickAnim - 0) / 3) * (115.36642-(49.02077)));
            yy = -36.41015 + (((tickAnim - 0) / 3) * (-8.60367-(-36.41015)));
            zz = -13.09504 + (((tickAnim - 0) / 3) * (-6.66537-(-13.09504)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 115.36642 + (((tickAnim - 3) / 2) * (35.25932-(115.36642)));
            yy = -8.60367 + (((tickAnim - 3) / 2) * (7.11487-(-8.60367)));
            zz = -6.66537 + (((tickAnim - 3) / 2) * (-13.45265-(-6.66537)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 35.25932 + (((tickAnim - 5) / 1) * (18.52924-(35.25932)));
            yy = 7.11487 + (((tickAnim - 5) / 1) * (22.51153-(7.11487)));
            zz = -13.45265 + (((tickAnim - 5) / 1) * (3.25269-(-13.45265)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 18.52924 + (((tickAnim - 6) / 2) * (4.13614-(18.52924)));
            yy = 22.51153 + (((tickAnim - 6) / 2) * (-18.03803-(22.51153)));
            zz = 3.25269 + (((tickAnim - 6) / 2) * (-7.81361-(3.25269)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 4.13614 + (((tickAnim - 8) / 4) * (49.02077-(4.13614)));
            yy = -18.03803 + (((tickAnim - 8) / 4) * (-36.41015-(-18.03803)));
            zz = -7.81361 + (((tickAnim - 8) / 4) * (-13.09504-(-7.81361)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg6, frontrightleg6.rotateAngleX + (float) Math.toRadians(xx), frontrightleg6.rotateAngleY + (float) Math.toRadians(yy), frontrightleg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5.18611-(0)));
            yy = 58.5 + (((tickAnim - 0) / 3) * (18.26773-(58.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.50914-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 5.18611 + (((tickAnim - 3) / 4) * (24.79763-(5.18611)));
            yy = 18.26773 + (((tickAnim - 3) / 4) * (-23.00922-(18.26773)));
            zz = 0.50914 + (((tickAnim - 3) / 4) * (-30.87644-(0.50914)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 24.79763 + (((tickAnim - 7) / 2) * (13.91201-(24.79763)));
            yy = -23.00922 + (((tickAnim - 7) / 2) * (13.86534-(-23.00922)));
            zz = -30.87644 + (((tickAnim - 7) / 2) * (-26.65077-(-30.87644)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 13.91201 + (((tickAnim - 9) / 3) * (0-(13.91201)));
            yy = 13.86534 + (((tickAnim - 9) / 3) * (58.5-(13.86534)));
            zz = -26.65077 + (((tickAnim - 9) / 3) * (0-(-26.65077)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -11.7767 + (((tickAnim - 0) / 7) * (0-(-11.7767)));
            yy = -11.90475 + (((tickAnim - 0) / 7) * (0-(-11.90475)));
            zz = 3.14359 + (((tickAnim - 0) / 7) * (-10.25-(3.14359)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (-3.66016-(0)));
            yy = 0 + (((tickAnim - 7) / 2) * (-7.52721-(0)));
            zz = -10.25 + (((tickAnim - 7) / 2) * (-22.36876-(-10.25)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -3.66016 + (((tickAnim - 9) / 2) * (-38.04818-(-3.66016)));
            yy = -7.52721 + (((tickAnim - 9) / 2) * (-10.02866-(-7.52721)));
            zz = -22.36876 + (((tickAnim - 9) / 2) * (-7.79028-(-22.36876)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -38.04818 + (((tickAnim - 11) / 1) * (-11.7767-(-38.04818)));
            yy = -10.02866 + (((tickAnim - 11) / 1) * (-11.90475-(-10.02866)));
            zz = -7.79028 + (((tickAnim - 11) / 1) * (3.14359-(-7.79028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.27314 + (((tickAnim - 0) / 3) * (4.78999-(17.27314)));
            yy = -21.42938 + (((tickAnim - 0) / 3) * (13.44501-(-21.42938)));
            zz = -7.95583 + (((tickAnim - 0) / 3) * (3.32801-(-7.95583)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 4.78999 + (((tickAnim - 3) / 4) * (68.77077-(4.78999)));
            yy = 13.44501 + (((tickAnim - 3) / 4) * (36.4102-(13.44501)));
            zz = 3.32801 + (((tickAnim - 3) / 4) * (13.095-(3.32801)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 68.77077 + (((tickAnim - 7) / 2) * (111.18168-(68.77077)));
            yy = 36.4102 + (((tickAnim - 7) / 2) * (-5.14283-(36.4102)));
            zz = 13.095 + (((tickAnim - 7) / 2) * (-2.76093-(13.095)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 111.18168 + (((tickAnim - 9) / 3) * (17.27314-(111.18168)));
            yy = -5.14283 + (((tickAnim - 9) / 3) * (-21.42938-(-5.14283)));
            zz = -2.76093 + (((tickAnim - 9) / 3) * (-7.95583-(-2.76093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg7, frontleftleg7.rotateAngleX + (float) Math.toRadians(xx), frontleftleg7.rotateAngleY + (float) Math.toRadians(yy), frontleftleg7.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617/0.5))*1), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617-10))*5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+20))*-4));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620))*-0.3);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5))*0.4);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(0), lowerbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617-50))*10), lowerbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+20))*-2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617-90))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+40))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617-130))*7), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617-170))*10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+80))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617-200))*15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+80))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+70))*8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+20))*-4));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*620/0.5-20))*0.1);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+180))*10), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+20))*4));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617/0.5-40))*-0.1);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(9.75), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+220))*8), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+40))*2));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617/0.5-50))*-0.1);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-8.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+290))*8), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+70))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617+390))*10), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*617/0.5-70))*-0.05);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTeraterpeton entity = (EntityPrehistoricFloraTeraterpeton) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.96731 + (((tickAnim - 0) / 3) * (8.37017-(7.96731)));
            yy = -58.67886 + (((tickAnim - 0) / 3) * (-34.16251-(-58.67886)));
            zz = -14.16499 + (((tickAnim - 0) / 3) * (-22.18289-(-14.16499)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 8.37017 + (((tickAnim - 3) / 7) * (1.90631-(8.37017)));
            yy = -34.16251 + (((tickAnim - 3) / 7) * (9.7042-(-34.16251)));
            zz = -22.18289 + (((tickAnim - 3) / 7) * (3.3457-(-22.18289)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 1.90631 + (((tickAnim - 10) / 6) * (4.78646-(1.90631)));
            yy = 9.7042 + (((tickAnim - 10) / 6) * (-17.18517-(9.7042)));
            zz = 3.3457 + (((tickAnim - 10) / 6) * (0.3107-(3.3457)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 4.78646 + (((tickAnim - 16) / 9) * (7.96731-(4.78646)));
            yy = -17.18517 + (((tickAnim - 16) / 9) * (-58.67886-(-17.18517)));
            zz = 0.3107 + (((tickAnim - 16) / 9) * (-14.16499-(0.3107)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg, backleftleg.rotateAngleX + (float) Math.toRadians(xx), backleftleg.rotateAngleY + (float) Math.toRadians(yy), backleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 30.98572 + (((tickAnim - 0) / 7) * (-37.9379-(30.98572)));
            yy = 38.77594 + (((tickAnim - 0) / 7) * (9.28434-(38.77594)));
            zz = -8.33124 + (((tickAnim - 0) / 7) * (-49.52727-(-8.33124)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -37.9379 + (((tickAnim - 7) / 3) * (-27.21415-(-37.9379)));
            yy = 9.28434 + (((tickAnim - 7) / 3) * (-13.1483-(9.28434)));
            zz = -49.52727 + (((tickAnim - 7) / 3) * (-16.7025-(-49.52727)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -27.21415 + (((tickAnim - 10) / 15) * (30.98572-(-27.21415)));
            yy = -13.1483 + (((tickAnim - 10) / 15) * (38.77594-(-13.1483)));
            zz = -16.7025 + (((tickAnim - 10) / 15) * (-8.33124-(-16.7025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg2, backleftleg2.rotateAngleX + (float) Math.toRadians(xx), backleftleg2.rotateAngleY + (float) Math.toRadians(yy), backleftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0.7 + (((tickAnim - 7) / 3) * (0-(0.7)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backleftleg2.rotationPointX = this.backleftleg2.rotationPointX + (float)(xx);
        this.backleftleg2.rotationPointY = this.backleftleg2.rotationPointY - (float)(yy);
        this.backleftleg2.rotationPointZ = this.backleftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.25 + (((tickAnim - 0) / 3) * (75.25-(22.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 75.25 + (((tickAnim - 3) / 7) * (32-(75.25)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 32 + (((tickAnim - 10) / 6) * (-0.17015-(32)));
            yy = 0 + (((tickAnim - 10) / 6) * (14.44343-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (2.1045-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -0.17015 + (((tickAnim - 16) / 9) * (22.25-(-0.17015)));
            yy = 14.44343 + (((tickAnim - 16) / 9) * (0-(14.44343)));
            zz = 2.1045 + (((tickAnim - 16) / 9) * (0-(2.1045)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backleftleg3, backleftleg3.rotateAngleX + (float) Math.toRadians(xx), backleftleg3.rotateAngleY + (float) Math.toRadians(yy), backleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 1.07772 + (((tickAnim - 0) / 12) * (7.96731-(1.07772)));
            yy = 7.75821 + (((tickAnim - 0) / 12) * (58.6789-(7.75821)));
            zz = -1.45088 + (((tickAnim - 0) / 12) * (14.165-(-1.45088)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 7.96731 + (((tickAnim - 12) / 6) * (3.38625-(7.96731)));
            yy = 58.6789 + (((tickAnim - 12) / 6) * (20.46823-(58.6789)));
            zz = 14.165 + (((tickAnim - 12) / 6) * (24.23124-(14.165)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 3.38625 + (((tickAnim - 18) / 5) * (1.90631-(3.38625)));
            yy = 20.46823 + (((tickAnim - 18) / 5) * (-9.70424-(20.46823)));
            zz = 24.23124 + (((tickAnim - 18) / 5) * (-3.3457-(24.23124)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 1.90631 + (((tickAnim - 23) / 2) * (1.07772-(1.90631)));
            yy = -9.70424 + (((tickAnim - 23) / 2) * (7.75821-(-9.70424)));
            zz = -3.3457 + (((tickAnim - 23) / 2) * (-1.45088-(-3.3457)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg4, backrightleg4.rotateAngleX + (float) Math.toRadians(xx), backrightleg4.rotateAngleY + (float) Math.toRadians(yy), backrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -28.23837 + (((tickAnim - 0) / 12) * (30.98572-(-28.23837)));
            yy = 8.30933 + (((tickAnim - 0) / 12) * (-38.7759-(8.30933)));
            zz = 11.94087 + (((tickAnim - 0) / 12) * (8.3312-(11.94087)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 30.98572 + (((tickAnim - 12) / 6) * (-6.1461-(30.98572)));
            yy = -38.7759 + (((tickAnim - 12) / 6) * (-20.05122-(-38.7759)));
            zz = 8.3312 + (((tickAnim - 12) / 6) * (22.34468-(8.3312)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -6.1461 + (((tickAnim - 18) / 5) * (-27.21415-(-6.1461)));
            yy = -20.05122 + (((tickAnim - 18) / 5) * (13.14825-(-20.05122)));
            zz = 22.34468 + (((tickAnim - 18) / 5) * (16.7025-(22.34468)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -27.21415 + (((tickAnim - 23) / 2) * (-28.23837-(-27.21415)));
            yy = 13.14825 + (((tickAnim - 23) / 2) * (8.30933-(13.14825)));
            zz = 16.7025 + (((tickAnim - 23) / 2) * (11.94087-(16.7025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg5, backrightleg5.rotateAngleX + (float) Math.toRadians(xx), backrightleg5.rotateAngleY + (float) Math.toRadians(yy), backrightleg5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 6) * (0.75-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 0.75 + (((tickAnim - 18) / 5) * (0-(0.75)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backrightleg5.rotationPointX = this.backrightleg5.rotationPointX + (float)(xx);
        this.backrightleg5.rotationPointY = this.backrightleg5.rotationPointY - (float)(yy);
        this.backrightleg5.rotationPointZ = this.backrightleg5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 29.27678 + (((tickAnim - 0) / 12) * (22.25-(29.27678)));
            yy = -9.91705 + (((tickAnim - 0) / 12) * (0-(-9.91705)));
            zz = 5.23388 + (((tickAnim - 0) / 12) * (0-(5.23388)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 22.25 + (((tickAnim - 12) / 3) * (101.25-(22.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 101.25 + (((tickAnim - 15) / 3) * (34.28-(101.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 34.28 + (((tickAnim - 18) / 5) * (32-(34.28)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 32 + (((tickAnim - 23) / 2) * (29.27678-(32)));
            yy = 0 + (((tickAnim - 23) / 2) * (-9.91705-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (5.23388-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backrightleg6, backrightleg6.rotateAngleX + (float) Math.toRadians(xx), backrightleg6.rotateAngleY + (float) Math.toRadians(yy), backrightleg6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 18.58871 + (((tickAnim - 0) / 6) * (13.34098-(18.58871)));
            yy = 22.48917 + (((tickAnim - 0) / 6) * (-13.39412-(22.48917)));
            zz = 22.97601 + (((tickAnim - 0) / 6) * (24.62494-(22.97601)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 13.34098 + (((tickAnim - 6) / 6) * (0-(13.34098)));
            yy = -13.39412 + (((tickAnim - 6) / 6) * (-44.25-(-13.39412)));
            zz = 24.62494 + (((tickAnim - 6) / 6) * (0-(24.62494)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 12) / 6) * (4.69312-(0)));
            yy = -44.25 + (((tickAnim - 12) / 6) * (-9.32036-(-44.25)));
            zz = 0 + (((tickAnim - 12) / 6) * (-1.97394-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 4.69312 + (((tickAnim - 18) / 7) * (18.58871-(4.69312)));
            yy = -9.32036 + (((tickAnim - 18) / 7) * (22.48917-(-9.32036)));
            zz = -1.97394 + (((tickAnim - 18) / 7) * (22.97601-(-1.97394)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg4, frontrightleg4.rotateAngleX + (float) Math.toRadians(xx), frontrightleg4.rotateAngleY + (float) Math.toRadians(yy), frontrightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-4.178-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (7.25369-(0)));
            zz = 10.25 + (((tickAnim - 0) / 6) * (21.48826-(10.25)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -4.178 + (((tickAnim - 6) / 3) * (-23.64877-(-4.178)));
            yy = 7.25369 + (((tickAnim - 6) / 3) * (9.66081-(7.25369)));
            zz = 21.48826 + (((tickAnim - 6) / 3) * (7.88553-(21.48826)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -23.64877 + (((tickAnim - 9) / 3) * (-11.7767-(-23.64877)));
            yy = 9.66081 + (((tickAnim - 9) / 3) * (11.9047-(9.66081)));
            zz = 7.88553 + (((tickAnim - 9) / 3) * (3.14359-(7.88553)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -11.7767 + (((tickAnim - 12) / 13) * (0-(-11.7767)));
            yy = 11.9047 + (((tickAnim - 12) / 13) * (0-(11.9047)));
            zz = 3.14359 + (((tickAnim - 12) / 13) * (10.25-(3.14359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg5, frontrightleg5.rotateAngleX + (float) Math.toRadians(xx), frontrightleg5.rotateAngleY + (float) Math.toRadians(yy), frontrightleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 49.02077 + (((tickAnim - 0) / 6) * (115.36642-(49.02077)));
            yy = -36.41015 + (((tickAnim - 0) / 6) * (-8.60367-(-36.41015)));
            zz = -13.09504 + (((tickAnim - 0) / 6) * (-6.66537-(-13.09504)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 115.36642 + (((tickAnim - 6) / 3) * (35.25932-(115.36642)));
            yy = -8.60367 + (((tickAnim - 6) / 3) * (7.11487-(-8.60367)));
            zz = -6.66537 + (((tickAnim - 6) / 3) * (-13.45265-(-6.66537)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 35.25932 + (((tickAnim - 9) / 3) * (16.25152-(35.25932)));
            yy = 7.11487 + (((tickAnim - 9) / 3) * (0.3341-(7.11487)));
            zz = -13.45265 + (((tickAnim - 9) / 3) * (-2.53219-(-13.45265)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 16.25152 + (((tickAnim - 12) / 6) * (4.13614-(16.25152)));
            yy = 0.3341 + (((tickAnim - 12) / 6) * (-18.03803-(0.3341)));
            zz = -2.53219 + (((tickAnim - 12) / 6) * (-7.81361-(-2.53219)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 4.13614 + (((tickAnim - 18) / 7) * (49.02077-(4.13614)));
            yy = -18.03803 + (((tickAnim - 18) / 7) * (-36.41015-(-18.03803)));
            zz = -7.81361 + (((tickAnim - 18) / 7) * (-13.09504-(-7.81361)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontrightleg6, frontrightleg6.rotateAngleX + (float) Math.toRadians(xx), frontrightleg6.rotateAngleY + (float) Math.toRadians(yy), frontrightleg6.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (-0.37-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            yy = -0.37 + (((tickAnim - 14) / 3) * (-0.35-(-0.37)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            yy = -0.35 + (((tickAnim - 17) / 8) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontrightleg6.rotationPointX = this.frontrightleg6.rotationPointX + (float)(xx);
        this.frontrightleg6.rotationPointY = this.frontrightleg6.rotationPointY - (float)(yy);
        this.frontrightleg6.rotationPointZ = this.frontrightleg6.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.18611-(0)));
            yy = 44.25 + (((tickAnim - 0) / 5) * (18.26773-(44.25)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.50914-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 5.18611 + (((tickAnim - 5) / 8) * (18.58871-(5.18611)));
            yy = 18.26773 + (((tickAnim - 5) / 8) * (-22.4892-(18.26773)));
            zz = 0.50914 + (((tickAnim - 5) / 8) * (-22.976-(0.50914)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 18.58871 + (((tickAnim - 13) / 6) * (12.06702-(18.58871)));
            yy = -22.4892 + (((tickAnim - 13) / 6) * (12.45901-(-22.4892)));
            zz = -22.976 + (((tickAnim - 13) / 6) * (-20.2878-(-22.976)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 12.06702 + (((tickAnim - 19) / 6) * (0-(12.06702)));
            yy = 12.45901 + (((tickAnim - 19) / 6) * (44.25-(12.45901)));
            zz = -20.2878 + (((tickAnim - 19) / 6) * (0-(-20.2878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg, frontleftleg.rotateAngleX + (float) Math.toRadians(xx), frontleftleg.rotateAngleY + (float) Math.toRadians(yy), frontleftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -11.7767 + (((tickAnim - 0) / 13) * (0-(-11.7767)));
            yy = -11.90475 + (((tickAnim - 0) / 13) * (0-(-11.90475)));
            zz = 3.14359 + (((tickAnim - 0) / 13) * (-10.25-(3.14359)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (-3.66016-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (-7.52721-(0)));
            zz = -10.25 + (((tickAnim - 13) / 6) * (-22.36876-(-10.25)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -3.66016 + (((tickAnim - 19) / 4) * (-38.04818-(-3.66016)));
            yy = -7.52721 + (((tickAnim - 19) / 4) * (-10.02866-(-7.52721)));
            zz = -22.36876 + (((tickAnim - 19) / 4) * (-7.79028-(-22.36876)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -38.04818 + (((tickAnim - 23) / 2) * (-11.7767-(-38.04818)));
            yy = -10.02866 + (((tickAnim - 23) / 2) * (-11.90475-(-10.02866)));
            zz = -7.79028 + (((tickAnim - 23) / 2) * (3.14359-(-7.79028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg3, frontleftleg3.rotateAngleX + (float) Math.toRadians(xx), frontleftleg3.rotateAngleY + (float) Math.toRadians(yy), frontleftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 16.25152 + (((tickAnim - 0) / 5) * (4.78999-(16.25152)));
            yy = -0.33411 + (((tickAnim - 0) / 5) * (13.44501-(-0.33411)));
            zz = -2.53219 + (((tickAnim - 0) / 5) * (3.32801-(-2.53219)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 4.78999 + (((tickAnim - 5) / 8) * (49.02077-(4.78999)));
            yy = 13.44501 + (((tickAnim - 5) / 8) * (36.4102-(13.44501)));
            zz = 3.32801 + (((tickAnim - 5) / 8) * (13.095-(3.32801)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 49.02077 + (((tickAnim - 13) / 6) * (111.18168-(49.02077)));
            yy = 36.4102 + (((tickAnim - 13) / 6) * (-5.14283-(36.4102)));
            zz = 13.095 + (((tickAnim - 13) / 6) * (-2.76093-(13.095)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 111.18168 + (((tickAnim - 19) / 6) * (16.25152-(111.18168)));
            yy = -5.14283 + (((tickAnim - 19) / 6) * (-0.33411-(-5.14283)));
            zz = -2.76093 + (((tickAnim - 19) / 6) * (-2.53219-(-2.76093)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontleftleg7, frontleftleg7.rotateAngleX + (float) Math.toRadians(xx), frontleftleg7.rotateAngleY + (float) Math.toRadians(yy), frontleftleg7.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.37-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.37 + (((tickAnim - 3) / 2) * (-0.35-(-0.37)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = -0.35 + (((tickAnim - 5) / 8) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontleftleg7.rotationPointX = this.frontleftleg7.rotationPointX + (float)(xx);
        this.frontleftleg7.rotationPointY = this.frontleftleg7.rotationPointY - (float)(yy);
        this.frontleftleg7.rotationPointZ = this.frontleftleg7.rotationPointZ + (float)(zz);



        this.setRotateAngle(hip, hip.rotateAngleX + (float) Math.toRadians(0), hip.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-10))*1.5), hip.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-2));
        this.hip.rotationPointX = this.hip.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*-0.2);
        this.hip.rotationPointY = this.hip.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-20))*0.15);
        this.hip.rotationPointZ = this.hip.rotationPointZ + (float)(0);


        this.setRotateAngle(lowerbody, lowerbody.rotateAngleX + (float) Math.toRadians(0), lowerbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*2), lowerbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-2));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-90))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+40))*-2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-130))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-170))*7), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-230))*10), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+80))*-2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+70))*2.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*-2));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+180))*3), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+20))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+220))*3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+40))*2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+290))*3), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+70))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+340))*3), head.rotateAngleZ + (float) Math.toRadians(0));

    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTeraterpeton e = (EntityPrehistoricFloraTeraterpeton) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
