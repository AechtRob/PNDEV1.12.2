package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDatheosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDatheosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Datheosaurus;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended backleftleg;
    private final AdvancedModelRendererExtended backleftleg2;
    private final AdvancedModelRendererExtended backleftleg3;
    private final AdvancedModelRendererExtended backrightleg4;
    private final AdvancedModelRendererExtended backrightleg5;
    private final AdvancedModelRendererExtended backrightleg6;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended upperbody;
    private final AdvancedModelRendererExtended frontleftleg;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended frontleftleg2;
    private final AdvancedModelRendererExtended frontleftleg3;
    private final AdvancedModelRendererExtended frontrightleg4;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended frontrightleg5;
    private final AdvancedModelRendererExtended frontrightleg6;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended jaw;

    private ModelAnimator animator;

    public ModelDatheosaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Datheosaurus = new AdvancedModelRendererExtended(this);
        this.Datheosaurus.setRotationPoint(0.0F, 22.5F, 0.0F);


        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(-2.5F, -3.25F, 5.0F);
        this.Datheosaurus.addChild(body2);
        this.setRotateAngle(body2, -0.1745F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 25, 0, -2.5F, -1.4566F, -0.9881F, 5, 4, 6, 0.0F, false));

        this.backleftleg = new AdvancedModelRendererExtended(this);
        this.backleftleg.setRotationPoint(1.75F, 1.2934F, 3.5119F);
        this.body2.addChild(backleftleg);
        this.setRotateAngle(backleftleg, -0.0366F, 0.6973F, -0.0569F);
        this.backleftleg.cubeList.add(new ModelBox(backleftleg, 0, 36, 0.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.backleftleg2 = new AdvancedModelRendererExtended(this);
        this.backleftleg2.setRotationPoint(3.5F, 0.25F, 0.0F);
        this.backleftleg.addChild(backleftleg2);
        this.setRotateAngle(backleftleg2, -0.0076F, -0.043F, 0.0002F);
        this.backleftleg2.cubeList.add(new ModelBox(backleftleg2, 0, 0, -0.75F, -1.0F, -1.0F, 2, 4, 2, 0.0F, false));

        this.backleftleg3 = new AdvancedModelRendererExtended(this);
        this.backleftleg3.setRotationPoint(0.5368F, 3.2245F, -0.0449F);
        this.backleftleg2.addChild(backleftleg3);
        this.setRotateAngle(backleftleg3, 0.0633F, -0.7507F, 0.1767F);
        this.backleftleg3.cubeList.add(new ModelBox(backleftleg3, 31, 31, -1.4327F, -0.6539F, -3.0241F, 3, 1, 4, 0.0F, false));

        this.backrightleg4 = new AdvancedModelRendererExtended(this);
        this.backrightleg4.setRotationPoint(-1.75F, 1.2934F, 3.5119F);
        this.body2.addChild(backrightleg4);
        this.setRotateAngle(backrightleg4, -0.0366F, -0.6973F, 0.0569F);
        this.backrightleg4.cubeList.add(new ModelBox(backrightleg4, 0, 36, -4.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.backrightleg5 = new AdvancedModelRendererExtended(this);
        this.backrightleg5.setRotationPoint(-3.5F, 0.25F, 0.0F);
        this.backrightleg4.addChild(backrightleg5);
        this.setRotateAngle(backrightleg5, -0.0076F, 0.043F, -0.0002F);
        this.backrightleg5.cubeList.add(new ModelBox(backrightleg5, 0, 0, -1.25F, -1.0F, -1.0F, 2, 4, 2, 0.0F, true));

        this.backrightleg6 = new AdvancedModelRendererExtended(this);
        this.backrightleg6.setRotationPoint(-0.5368F, 3.2245F, -0.0449F);
        this.backrightleg5.addChild(backrightleg6);
        this.setRotateAngle(backrightleg6, 0.0633F, 0.7507F, -0.1767F);
        this.backrightleg6.cubeList.add(new ModelBox(backrightleg6, 31, 31, -1.5673F, -0.6539F, -3.0241F, 3, 1, 4, 0.0F, true));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -1.2492F, 4.9882F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, -0.0447F, 0.0F, -0.0097F);
        this.tail.cubeList.add(new ModelBox(tail, 12, 16, -2.0F, -0.0804F, -1.1137F, 4, 3, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, 0.216F, 5.8228F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0457F, 0.0F, -0.0138F);
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 26, -1.5F, -0.0785F, -1.0701F, 3, 2, 7, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.7325F, 5.8684F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0401F, 0.0F, -0.0188F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 28, -1.0F, -0.5872F, -0.5019F, 2, 1, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.0872F, 6.4981F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1827F, 0.0F, 0.0421F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 16, -0.5F, -0.5F, 0.0F, 1, 1, 10, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.1087F, -0.3235F, 0.3039F);
        this.body2.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -1.518F, -11.1619F, 7, 5, 11, 0.0F, false));

        this.upperbody = new AdvancedModelRendererExtended(this);
        this.upperbody.setRotationPoint(-0.5382F, 0.7626F, -10.9562F);
        this.body.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.0436F, 0.0F, 0.0F);
        this.upperbody.cubeList.add(new ModelBox(upperbody, 27, 16, -2.4618F, -2.0382F, -2.0314F, 6, 4, 3, 0.0F, false));

        this.frontleftleg = new AdvancedModelRendererExtended(this);
        this.frontleftleg.setRotationPoint(3.2882F, 1.2118F, 0.2186F);
        this.upperbody.addChild(frontleftleg);
        this.setRotateAngle(frontleftleg, 0.0F, -0.5236F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.frontleftleg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 10, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));

        this.frontleftleg2 = new AdvancedModelRendererExtended(this);
        this.frontleftleg2.setRotationPoint(2.25F, 1.0F, 0.0F);
        this.frontleftleg.addChild(frontleftleg2);
        this.setRotateAngle(frontleftleg2, 0.0F, -0.0436F, 0.0F);
        this.frontleftleg2.cubeList.add(new ModelBox(frontleftleg2, 0, 16, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F, false));

        this.frontleftleg3 = new AdvancedModelRendererExtended(this);
        this.frontleftleg3.setRotationPoint(0.287F, 2.3071F, -0.25F);
        this.frontleftleg2.addChild(frontleftleg3);
        this.setRotateAngle(frontleftleg3, 0.0944F, 0.3911F, 0.0361F);
        this.frontleftleg3.cubeList.add(new ModelBox(frontleftleg3, 14, 35, -1.5F, -0.5F, -3.0F, 3, 1, 4, -0.01F, false));

        this.frontrightleg4 = new AdvancedModelRendererExtended(this);
        this.frontrightleg4.setRotationPoint(-2.2118F, 1.2118F, 0.2186F);
        this.upperbody.addChild(frontrightleg4);
        this.setRotateAngle(frontrightleg4, 0.0F, 0.5236F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.frontrightleg4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 10, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, true));

        this.frontrightleg5 = new AdvancedModelRendererExtended(this);
        this.frontrightleg5.setRotationPoint(-2.25F, 1.0F, 0.0F);
        this.frontrightleg4.addChild(frontrightleg5);
        this.setRotateAngle(frontrightleg5, 0.0F, 0.0436F, 0.0F);
        this.frontrightleg5.cubeList.add(new ModelBox(frontrightleg5, 0, 16, -1.0F, -1.0F, -1.0F, 2, 3, 2, 0.0F, true));

        this.frontrightleg6 = new AdvancedModelRendererExtended(this);
        this.frontrightleg6.setRotationPoint(-0.287F, 2.3071F, -0.25F);
        this.frontrightleg5.addChild(frontrightleg6);
        this.setRotateAngle(frontrightleg6, 0.0944F, -0.3911F, -0.0361F);
        this.frontrightleg6.cubeList.add(new ModelBox(frontrightleg6, 14, 35, -1.5F, -0.5F, -3.0F, 3, 1, 4, -0.01F, true));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.5382F, -1.8479F, -1.0378F);
        this.upperbody.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 28, 26, -2.5F, -0.1903F, -2.9936F, 5, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 36, -2.0F, -0.1903F, -4.9936F, 4, 2, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 35, 1.05F, 0.3097F, -4.4936F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 25, 35, -2.05F, 0.3097F, -4.4936F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 21, -1.5F, -0.1903F, -5.9936F, 3, 2, 1, 0.01F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -0.0977F, -6.0167F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 16, -1.0F, -0.0586F, -0.9199F, 2, 2, 1, 0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-1.5F, 1.6758F, -5.3168F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.05F, -0.4268F, -0.0732F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 2.95F, -0.4268F, -0.0732F, 0, 1, 1, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 5, 0.25F, -0.6768F, -0.3232F, 0, 1, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 5, 2.75F, -0.6768F, -0.3232F, 0, 1, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 3.5058F, -1.3473F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 38, -2.0F, -0.8627F, -2.1962F, 4, 1, 2, -0.01F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 1.8097F, -2.9936F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 9, -1.5F, 0.0F, -2.75F, 3, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 12, 19, -1.0F, 0.0F, -3.2F, 2, 1, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 23, -2.0F, 0.0F, -1.75F, 4, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 6, -1.5F, -1.0F, -0.75F, 3, 1, 2, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Datheosaurus.render(f5);
    }
    public void renderStaticPlinth(float f) {
        this.Datheosaurus.offsetX = 0.06F;
        this.Datheosaurus.offsetZ = -0.02F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.upperbody.rotateAngleY = (float) Math.toRadians(22.4);
        this.body.rotateAngleY = (float) Math.toRadians(24.7);
        this.tail.rotateAngleY = (float) Math.toRadians(-29.9);
        this.tail2.rotateAngleY = (float) Math.toRadians(-27.4);
        this.tail3.rotateAngleY = (float) Math.toRadians(-29.9);
        this.tail4.rotateAngleY = (float) Math.toRadians(-44);
        this.Datheosaurus.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Datheosaurus.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(body2, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(backleftleg, -0.0415F, 0.8281F, -0.064F);
        this.setRotateAngle(backleftleg2, 0.0038F, -0.0435F, -0.2619F);
        this.setRotateAngle(backleftleg3, 0.3055F, -1.0118F, 0.1458F);
        this.setRotateAngle(backrightleg4, -0.0511F, -0.1688F, 0.1711F);
        this.setRotateAngle(backrightleg5, 0.2541F, 0.1739F, -0.0012F);
        this.setRotateAngle(backrightleg6, -0.1435F, 0.9672F, -0.219F);
        this.setRotateAngle(tail, -0.0447F, 0.218F, -0.0097F);
        this.setRotateAngle(tail2, -0.0457F, 0.3051F, -0.0138F);
        this.setRotateAngle(tail3, 0.0401F, 0.5667F, -0.0188F);
        this.setRotateAngle(tail4, 0.1827F, 0.5664F, 0.0421F);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(upperbody, -0.0452F, 0.2615F, -0.0117F);
        this.setRotateAngle(frontleftleg, 0.2992F, -0.833F, -0.395F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
        this.setRotateAngle(frontleftleg2, 0.2618F, 0.1745F, 0.0F);
        this.setRotateAngle(frontleftleg3, -0.1307F, 0.1577F, 0.2542F);
        this.setRotateAngle(frontrightleg4, 0.0094F, -0.2176F, 0.0748F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.3927F);
        this.setRotateAngle(frontrightleg5, -0.3077F, 0.1268F, -0.0264F);
        this.setRotateAngle(frontrightleg6, 0.4492F, 0.0984F, -0.0007F);
        this.setRotateAngle(head, 0.1752F, -0.0859F, -0.0152F);
        this.setRotateAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.5672F, 0.0F, 0.0F);
        this.Datheosaurus.offsetY = -0.09F;
        this.Datheosaurus.offsetX = 0F;
        this.Datheosaurus.offsetZ = -0.02F;
        this.Datheosaurus.render(0.01F);
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
        //this.Datheosaurus.offsetY = 0.65F;

        EntityPrehistoricFloraDatheosaurus DatheosaurusEntity = (EntityPrehistoricFloraDatheosaurus) e;
        float masterSpeed = DatheosaurusEntity.getTravelSpeed();

        //masterSpeed = 0.315F;

        this.faceTarget(f3, f4, 7, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        DatheosaurusEntity.tailBuffer.applyChainSwingBuffer(Tail);
        if (DatheosaurusEntity.getAnimation() == DatheosaurusEntity.LAY_ANIMATION) {
            this.swing(head, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(head, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }

        if (f3 == 0.0F || !DatheosaurusEntity.getIsMoving()) { //Not moving
            this.swing(head, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(head, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            //this.chainWave(Tail, (0.06F*0.9F), 0.02F, 0.1F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
        }

        //float speed = masterSpeed / 2.625F;
        float speed = masterSpeed / 2.025F;
        if (DatheosaurusEntity.getIsFast()) {
            speed = speed * 2;
        }

        if (DatheosaurusEntity.getAnimation() != DatheosaurusEntity.ATTACK_ANIMATION) {
            this.frontleftleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.5), false, 3, f2, 1.5F);
            this.frontrightleg4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.5), false, 6, f2, 1.5F);
        }
        this.backleftleg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.35), false, 4, f2, 1.5F);;
        this.backrightleg4.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(0.35), false, 7, f2, 1.5F);;

        if (DatheosaurusEntity.getAnimation() != DatheosaurusEntity.ATTACK_ANIMATION) {
            this.swing(frontleftleg, speed, -0.25F, false, 3, 0.35F, f2, 1F);
            this.swing(frontrightleg4, speed, 0.25F, false, 0, -0.35F, f2, 1F);
        }

        this.swing(backleftleg, speed, -0.15F, false, 3, -0.15F, f2, 1F);
        this.swing(backrightleg4, speed, 0.15F, false, 0, 0.15F, f2, 1F);

        if (DatheosaurusEntity.getAnimation() != DatheosaurusEntity.ATTACK_ANIMATION) {
            this.flap(frontleftleg, speed, 0.25F, true, 1, 0.085F, f2, 1F);
            this.flap(frontrightleg4, speed, -0.25F, true, 4, -0.085F, f2, 1F);
        }
        //this.walk(backleftleg, speed, 0.25F, true, 4, 0.125F, f2, 1F);
        //this.walk(backrightleg4, speed, 0.25F, true, 1, 0.125F, f2, 1F);

        if (DatheosaurusEntity.getAnimation() != DatheosaurusEntity.ATTACK_ANIMATION) {
            this.walk(frontleftleg2, speed, 0.35F, true, 0, 0.17F, f2, 1F);
            this.walk(frontrightleg5, speed, 0.35F, true, 3, 0.17F, f2, 1F);
        }

        this.walk(backleftleg2, speed, -0.25F, false, 5, -0.25F, f2, 1F);
        this.walk(backrightleg5, speed, -0.25F, false, 2, -0.25F, f2, 1F);

        this.flap(backleftleg2, speed, -0.15F, false, 5, -0.15F, f2, 1F);
        this.flap(backrightleg5, speed, 0.15F, false, 2, 0.15F, f2, 1F);

        this.swing(backleftleg3, speed, -0.2F, false, 5, 0.10F, f2, 1F);
        this.swing(backrightleg6, speed, 0.2F, false, 2, -0.10F, f2, 1F);

        if (DatheosaurusEntity.getAnimation() != DatheosaurusEntity.ATTACK_ANIMATION) {
            this.walk(frontleftleg3, speed, -0.21F, true, 2, 0F, f2, 1F);
            this.walk(frontrightleg6, speed, -0.21F, true, 5, 0F, f2, 1F);

            this.flap(frontleftleg3, speed, -0.3F, true, 7, -0.1F, f2, 1F);
            this.flap(frontrightleg6, speed, 0.3F, true, 4, 0.1F, f2, 1F);
        }

        this.walk(backleftleg3, speed, 0.21F, true, 7, -0.12F, f2, 1F);
        this.walk(backrightleg6, speed, 0.21F, true, 4, -0.12F, f2, 1F);

        this.bobExtended(Datheosaurus, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(body, speed, 0.05F, false, 3.5F,0.025F, f2, 1.0F);
        this.flap(upperbody, speed, -0.05F, false, 3.5F,-0.025F, f2, 1.0F);
        this.walk(upperbody, speed * 2, 0.04F, false, 2.5F,-0.01F, f2, 0.8F);

        if (DatheosaurusEntity.getAnimation() != DatheosaurusEntity.ATTACK_ANIMATION) {
            this.swing(head, speed, 0.10F, false, 0.5F, -0.05F, f2, 0.8F);
            this.walk(head, speed * 2, -0.02F, false, 0.5F, 0.01F, f2, 0.8F);
        }
        if (DatheosaurusEntity.getAnimation() == DatheosaurusEntity.ROAR_ANIMATION) {
            this.walk(tail, (0.06F*0.9F) * 1.5F, 0.2F, false, 0,0.2f, f2, 1F);
            this.walk(tail2, (0.06F*0.9F) * 1.5F, 0.125F, false, 0.015F,0.1f, f2, 1F);
            this.walk(tail3, (0.06F*0.9F) * 1.5F, 0.125F, false, 0.03F,0.1f, f2, 1F);
            this.walk(tail4, (0.06F*0.9F) * 1.5F, 0.125F, false, 0.045F,0.1f, f2, 1F);
            this.chainSwing(Tail, (0.06F * 0.9F) * 2F * 3F, 0.275F, 0.5F, f2, 1F);
        }
        else {
            //this.chainWave(Tail, (0.06F*0.9F), 0.02F, 0.1F, f2, 1F);
            this.chainSwing(Tail, (0.06F * 0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
        }

        this.Datheosaurus.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDatheosaurus e = (EntityPrehistoricFloraDatheosaurus) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(4);
        animator.rotate(this.Datheosaurus, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.frontrightleg4, (float) Math.toRadians(0), (float) Math.toRadians(-50), (float) Math.toRadians(0));
        animator.rotate(this.frontleftleg2, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.frontrightleg6, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(7.5));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4);
        animator.rotate(this.head, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Datheosaurus, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Datheosaurus, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.frontrightleg4, (float) Math.toRadians(-25), (float) Math.toRadians(-90), (float) Math.toRadians(0));
        animator.rotate(this.frontleftleg2, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.frontrightleg6, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(7.5));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.startKeyframe(4);
        animator.rotate(this.Datheosaurus, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.frontrightleg4, (float) Math.toRadians(0), (float) Math.toRadians(-50), (float) Math.toRadians(0));
        animator.rotate(this.frontleftleg2, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.frontrightleg6, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(7.5));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(5);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.upperbody, (float) Math.toRadians(3), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.frontleftleg, (float) Math.toRadians(-3), 0,0);
        animator.rotate(this.frontrightleg4, (float) Math.toRadians(-3), 0,0);
        animator.rotate(this.frontleftleg2, (float) Math.toRadians(3), 0,0);
        animator.rotate(this.frontrightleg5, (float) Math.toRadians(3), 0,0);
        animator.rotate(this.head, (float) Math.toRadians(35), 0,0);
        animator.rotate(this.jaw, (float) Math.toRadians(40), 0,0);
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(4);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.head, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks
        animator.startKeyframe(15);
        animator.move(this.Datheosaurus, 0, 5,0);
        animator.rotate(this.backleftleg, (float) Math.toRadians(-20), 0,0);
        animator.rotate(this.backrightleg4, (float) Math.toRadians(-20), 0,0);
        animator.rotate(this.frontleftleg, 0,0, (float) Math.toRadians(20));
        animator.rotate(this.frontrightleg4, 0,0, (float) Math.toRadians(20));
        animator.rotate(this.backleftleg2, (float) Math.toRadians(20), 0,0);
        animator.rotate(this.backrightleg5, (float) Math.toRadians(20), 0,0);
        animator.rotate(this.frontleftleg2, 0,0, (float) Math.toRadians(-20));
        animator.rotate(this.frontrightleg5, 0,0, (float) Math.toRadians(-20));
        animator.rotate(this.tail, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.tail2, (float) Math.toRadians(10), 0,0);
        animator.rotate(this.head, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(20);
        animator.resetKeyframe(15);

    }
}
