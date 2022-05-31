package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVestinautilus extends AdvancedModelBase {
    private final AdvancedModelRenderer whole;
    private final AdvancedModelRenderer topmiddleright;
    private final AdvancedModelRenderer topmiddleleft;
    private final AdvancedModelRenderer lowerleft;
    private final AdvancedModelRenderer bottommiddleleft;
    private final AdvancedModelRenderer bottommiddleright;
    private final AdvancedModelRenderer bottomright;
    private final AdvancedModelRenderer bottom;
    private final AdvancedModelRenderer toprightarm;
    private final AdvancedModelRenderer topleft;
    private final AdvancedModelRenderer top;
    private final AdvancedModelRenderer hood;
    private final AdvancedModelRenderer hood_r1;
    private final AdvancedModelRenderer hood_r2;
    private final AdvancedModelRenderer shell;
    private final AdvancedModelRenderer shell_r1;
    private final AdvancedModelRenderer shell_r2;
    private final AdvancedModelRenderer shell_r3;
    private final AdvancedModelRenderer shell_r4;
    private final AdvancedModelRenderer shell_r5;
    private final AdvancedModelRenderer shell_r6;
    private final AdvancedModelRenderer shell_r7;
    private final AdvancedModelRenderer shell_r8;
    private final AdvancedModelRenderer shell_r9;
    private final AdvancedModelRenderer shell_r10;
    private final AdvancedModelRenderer shell_r11;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer lefteye_r1;
    private final AdvancedModelRenderer head_r1;
    private final AdvancedModelRenderer siphon;
    private final AdvancedModelRenderer siphon_r1;
    private final AdvancedModelRenderer tentacle9;
    private final AdvancedModelRenderer tentacles9;
    private final AdvancedModelRenderer tentacle10;
    private final AdvancedModelRenderer tentacles10;
    private final AdvancedModelRenderer tentacle8;
    private final AdvancedModelRenderer tentacles8;
    private final AdvancedModelRenderer tentacle11;
    private final AdvancedModelRenderer tentacles11;
    private final AdvancedModelRenderer tentacle7;
    private final AdvancedModelRenderer tentacles7;
    private final AdvancedModelRenderer tentacle12;
    private final AdvancedModelRenderer tentacles12;
    private final AdvancedModelRenderer tentacle6;
    private final AdvancedModelRenderer tentacles6;
    private final AdvancedModelRenderer tentacle13;
    private final AdvancedModelRenderer tentacles13;
    private final AdvancedModelRenderer tentacle5;
    private final AdvancedModelRenderer tentacles5;
    private final AdvancedModelRenderer tentacle14;
    private final AdvancedModelRenderer tentacles14;
    private final AdvancedModelRenderer tentacle4;
    private final AdvancedModelRenderer tentacles4;
    private final AdvancedModelRenderer tentacle15;
    private final AdvancedModelRenderer tentacles15;
    private final AdvancedModelRenderer tentacle3;
    private final AdvancedModelRenderer tentacles3;
    private final AdvancedModelRenderer tentacle16;
    private final AdvancedModelRenderer tentacles16;
    private final AdvancedModelRenderer tentacle2;
    private final AdvancedModelRenderer tentacles2;
    private final AdvancedModelRenderer tentacle17;
    private final AdvancedModelRenderer tentacles17;
    private final AdvancedModelRenderer tentacle;
    private final AdvancedModelRenderer tentacles;

    public ModelVestinautilus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.whole = new AdvancedModelRenderer(this);
        this.whole.setRotationPoint(-4.0F, 15.0F, -2.0F);
        this.setRotateAngle(whole, -1.6144F, 0.0F, 0.0F);


        this.topmiddleright = new AdvancedModelRenderer(this);
        this.topmiddleright.setRotationPoint(7.0F, 4.25F, -0.5F);
        this.whole.addChild(topmiddleright);


        this.topmiddleleft = new AdvancedModelRenderer(this);
        this.topmiddleleft.setRotationPoint(1.0F, 4.5F, -0.5F);
        this.whole.addChild(topmiddleleft);
        this.setRotateAngle(topmiddleleft, 0.0873F, 0.0F, 0.0F);


        this.lowerleft = new AdvancedModelRenderer(this);
        this.lowerleft.setRotationPoint(2.1F, 3.75F, 3.6F);
        this.whole.addChild(lowerleft);


        this.bottommiddleleft = new AdvancedModelRenderer(this);
        this.bottommiddleleft.setRotationPoint(1.0F, 3.75F, 1.5F);
        this.whole.addChild(bottommiddleleft);
        this.setRotateAngle(bottommiddleleft, -0.0436F, 0.0F, 0.0F);


        this.bottommiddleright = new AdvancedModelRenderer(this);
        this.bottommiddleright.setRotationPoint(7.0F, 3.75F, 1.25F);
        this.whole.addChild(bottommiddleright);


        this.bottomright = new AdvancedModelRenderer(this);
        this.bottomright.setRotationPoint(6.0F, 3.75F, 3.5F);
        this.whole.addChild(bottomright);


        this.bottom = new AdvancedModelRenderer(this);
        this.bottom.setRotationPoint(4.0F, 3.75F, 3.5F);
        this.whole.addChild(bottom);


        this.toprightarm = new AdvancedModelRenderer(this);
        this.toprightarm.setRotationPoint(6.0F, 4.75F, -2.5F);
        this.whole.addChild(toprightarm);


        this.topleft = new AdvancedModelRenderer(this);
        this.topleft.setRotationPoint(2.0F, 4.75F, -2.5F);
        this.whole.addChild(topleft);


        this.top = new AdvancedModelRenderer(this);
        this.top.setRotationPoint(4.0F, 4.75F, -2.5F);
        this.whole.addChild(top);


        this.hood = new AdvancedModelRenderer(this);
        this.hood.setRotationPoint(8.0F, 1.0F, -7.0F);
        this.whole.addChild(hood);


        this.hood_r1 = new AdvancedModelRenderer(this);
        this.hood_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hood.addChild(hood_r1);
        this.setRotateAngle(hood_r1, -0.0436F, 0.0F, 0.0F);
        this.hood_r1.cubeList.add(new ModelBox(hood_r1, 68, 56, -8.0F, -8.25F, -0.25F, 8, 8, 3, 0.0F, false));

        this.hood_r2 = new AdvancedModelRenderer(this);
        this.hood_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hood.addChild(hood_r2);
        this.setRotateAngle(hood_r2, -0.0873F, 0.0F, 0.0F);
        this.hood_r2.cubeList.add(new ModelBox(hood_r2, 0, 70, -9.0F, -8.75F, 1.25F, 10, 10, 2, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(7.5F, 0.0F, 2.0F);
        this.whole.addChild(shell);


        this.shell_r1 = new AdvancedModelRenderer(this);
        this.shell_r1.setRotationPoint(0.0F, -8.0F, -14.0F);
        this.shell.addChild(shell_r1);
        this.setRotateAngle(shell_r1, 0.8727F, -0.0436F, 0.0F);
        this.shell_r1.cubeList.add(new ModelBox(shell_r1, 0, 21, -3.6393F, -5.7495F, 6.6307F, 1, 8, 2, 0.0F, false));

        this.shell_r2 = new AdvancedModelRenderer(this);
        this.shell_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r2);
        this.setRotateAngle(shell_r2, -0.0873F, -0.0436F, 0.0F);
        this.shell_r2.cubeList.add(new ModelBox(shell_r2, 0, 0, -4.5F, -12.5F, -10.25F, 2, 8, 2, 0.0F, false));

        this.shell_r3 = new AdvancedModelRenderer(this);
        this.shell_r3.setRotationPoint(-3.75F, -7.0F, -17.0F);
        this.shell.addChild(shell_r3);
        this.setRotateAngle(shell_r3, 0.6109F, 0.0F, 0.0F);
        this.shell_r3.cubeList.add(new ModelBox(shell_r3, 36, 0, -1.75F, 3.2349F, 0.1785F, 4, 4, 8, 0.0F, false));

        this.shell_r4 = new AdvancedModelRenderer(this);
        this.shell_r4.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r4);
        this.setRotateAngle(shell_r4, 0.6109F, 0.0F, 0.0F);
        this.shell_r4.cubeList.add(new ModelBox(shell_r4, 60, 31, -2.25F, 3.5322F, -17.2149F, 6, 6, 6, 0.0F, false));

        this.shell_r5 = new AdvancedModelRenderer(this);
        this.shell_r5.setRotationPoint(-3.75F, -7.0F, -17.0F);
        this.shell.addChild(shell_r5);
        this.setRotateAngle(shell_r5, -0.0873F, 0.0F, 0.0F);
        this.shell_r5.cubeList.add(new ModelBox(shell_r5, 60, 0, -2.25F, 0.4849F, -1.8215F, 5, 5, 7, 0.0F, false));

        this.shell_r6 = new AdvancedModelRenderer(this);
        this.shell_r6.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r6);
        this.setRotateAngle(shell_r6, 0.1309F, 0.0F, 0.0F);
        this.shell_r6.cubeList.add(new ModelBox(shell_r6, 62, 67, -2.75F, 0.2822F, -14.2149F, 7, 12, 6, 0.0F, false));

        this.shell_r7 = new AdvancedModelRenderer(this);
        this.shell_r7.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r7);
        this.setRotateAngle(shell_r7, -0.829F, 0.0F, 0.0F);
        this.shell_r7.cubeList.add(new ModelBox(shell_r7, 0, 48, -3.25F, -1.9678F, -8.2149F, 8, 14, 8, 0.0F, false));

        this.shell_r8 = new AdvancedModelRenderer(this);
        this.shell_r8.setRotationPoint(-4.25F, -15.0F, -2.0F);
        this.shell.addChild(shell_r8);
        this.setRotateAngle(shell_r8, 0.5672F, 0.0F, 0.0F);
        this.shell_r8.cubeList.add(new ModelBox(shell_r8, 0, 21, -4.25F, -10.427F, -6.6562F, 10, 13, 11, 0.0F, false));

        this.shell_r9 = new AdvancedModelRenderer(this);
        this.shell_r9.setRotationPoint(-4.25F, -19.0F, -11.0F);
        this.shell.addChild(shell_r9);
        this.setRotateAngle(shell_r9, -0.0436F, 0.0F, 0.0F);
        this.shell_r9.cubeList.add(new ModelBox(shell_r9, 30, 33, -3.75F, -7.2178F, -5.4649F, 9, 11, 12, 0.0F, false));

        this.shell_r10 = new AdvancedModelRenderer(this);
        this.shell_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r10);
        this.setRotateAngle(shell_r10, 0.0436F, 0.0F, 0.0F);
        this.shell_r10.cubeList.add(new ModelBox(shell_r10, 0, 0, -9.5F, -15.75F, -8.25F, 12, 9, 12, 0.0F, false));

        this.shell_r11 = new AdvancedModelRenderer(this);
        this.shell_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(shell_r11);
        this.setRotateAngle(shell_r11, 0.1745F, 0.0F, 0.0F);
        this.shell_r11.cubeList.add(new ModelBox(shell_r11, 42, 15, -10.0F, -10.25F, -0.25F, 13, 10, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.whole.addChild(head);


        this.lefteye_r1 = new AdvancedModelRenderer(this);
        this.lefteye_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(lefteye_r1);
        this.setRotateAngle(lefteye_r1, 0.0873F, 0.0F, 0.0F);
        this.lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 31, 21, -1.0F, -6.0F, -2.0F, 1, 3, 3, 0.0F, false));
        this.lefteye_r1.cubeList.add(new ModelBox(lefteye_r1, 36, 0, 8.0F, -6.0F, -2.0F, 1, 3, 3, 0.0F, false));

        this.head_r1 = new AdvancedModelRenderer(this);
        this.head_r1.setRotationPoint(7.5F, 0.0F, 2.0F);
        this.head.addChild(head_r1);
        this.setRotateAngle(head_r1, 0.0436F, 0.0F, 0.0F);
        this.head_r1.cubeList.add(new ModelBox(head_r1, 32, 56, -8.0F, -7.0F, -6.0F, 9, 8, 9, 0.0F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(4.0F, -2.0F, 5.0F);
        this.head.addChild(siphon);


        this.siphon_r1 = new AdvancedModelRenderer(this);
        this.siphon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.siphon.addChild(siphon_r1);
        this.setRotateAngle(siphon_r1, 0.1309F, 0.0F, 0.0F);
        this.siphon_r1.cubeList.add(new ModelBox(siphon_r1, 24, 73, -1.5F, -5.0198F, -2.3624F, 3, 12, 3, 0.0F, false));

        this.tentacle9 = new AdvancedModelRenderer(this);
        this.tentacle9.setRotationPoint(4.0F, 1.0F, -2.5F);
        this.head.addChild(tentacle9);
        this.setRotateAngle(tentacle9, -0.3491F, 0.0F, 0.0F);
        this.tentacle9.cubeList.add(new ModelBox(tentacle9, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles9 = new AdvancedModelRenderer(this);
        this.tentacles9.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle9.addChild(tentacles9);
        this.tentacles9.cubeList.add(new ModelBox(tentacles9, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle10 = new AdvancedModelRenderer(this);
        this.tentacle10.setRotationPoint(3.0F, 1.0F, -2.0F);
        this.head.addChild(tentacle10);
        this.setRotateAngle(tentacle10, -0.2618F, 0.0F, 0.1309F);
        this.tentacle10.cubeList.add(new ModelBox(tentacle10, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles10 = new AdvancedModelRenderer(this);
        this.tentacles10.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle10.addChild(tentacles10);
        this.tentacles10.cubeList.add(new ModelBox(tentacles10, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle8 = new AdvancedModelRenderer(this);
        this.tentacle8.setRotationPoint(5.0F, 1.0F, -2.0F);
        this.head.addChild(tentacle8);
        this.setRotateAngle(tentacle8, -0.2618F, 0.0F, -0.1309F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles8 = new AdvancedModelRenderer(this);
        this.tentacles8.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle8.addChild(tentacles8);
        this.tentacles8.cubeList.add(new ModelBox(tentacles8, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle11 = new AdvancedModelRenderer(this);
        this.tentacle11.setRotationPoint(3.0F, 1.0F, 1.5F);
        this.head.addChild(tentacle11);
        this.setRotateAngle(tentacle11, 0.1745F, 0.0F, 0.1745F);
        this.tentacle11.cubeList.add(new ModelBox(tentacle11, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles11 = new AdvancedModelRenderer(this);
        this.tentacles11.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle11.addChild(tentacles11);
        this.tentacles11.cubeList.add(new ModelBox(tentacles11, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle7 = new AdvancedModelRenderer(this);
        this.tentacle7.setRotationPoint(5.0F, 1.0F, 1.5F);
        this.head.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.1745F, 0.0F, -0.1745F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles7 = new AdvancedModelRenderer(this);
        this.tentacles7.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle7.addChild(tentacles7);
        this.tentacles7.cubeList.add(new ModelBox(tentacles7, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle12 = new AdvancedModelRenderer(this);
        this.tentacle12.setRotationPoint(3.0F, 1.0F, -0.5F);
        this.head.addChild(tentacle12);
        this.setRotateAngle(tentacle12, -0.1745F, 0.0F, 0.1745F);
        this.tentacle12.cubeList.add(new ModelBox(tentacle12, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles12 = new AdvancedModelRenderer(this);
        this.tentacles12.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle12.addChild(tentacles12);
        this.tentacles12.cubeList.add(new ModelBox(tentacles12, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle6 = new AdvancedModelRenderer(this);
        this.tentacle6.setRotationPoint(5.0F, 1.0F, -0.5F);
        this.head.addChild(tentacle6);
        this.setRotateAngle(tentacle6, -0.1745F, 0.0F, -0.1309F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles6 = new AdvancedModelRenderer(this);
        this.tentacles6.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle6.addChild(tentacles6);
        this.tentacles6.cubeList.add(new ModelBox(tentacles6, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle13 = new AdvancedModelRenderer(this);
        this.tentacle13.setRotationPoint(1.75F, 1.0F, 3.5F);
        this.head.addChild(tentacle13);
        this.setRotateAngle(tentacle13, 0.2618F, 0.0F, 0.1309F);
        this.tentacle13.cubeList.add(new ModelBox(tentacle13, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles13 = new AdvancedModelRenderer(this);
        this.tentacles13.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle13.addChild(tentacles13);
        this.tentacles13.cubeList.add(new ModelBox(tentacles13, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle5 = new AdvancedModelRenderer(this);
        this.tentacle5.setRotationPoint(6.25F, 1.0F, 3.5F);
        this.head.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.2618F, 0.0F, -0.1309F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles5 = new AdvancedModelRenderer(this);
        this.tentacles5.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle5.addChild(tentacles5);
        this.tentacles5.cubeList.add(new ModelBox(tentacles5, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle14 = new AdvancedModelRenderer(this);
        this.tentacle14.setRotationPoint(1.0F, 1.0F, 1.5F);
        this.head.addChild(tentacle14);
        this.setRotateAngle(tentacle14, 0.1745F, 0.0F, 0.2182F);
        this.tentacle14.cubeList.add(new ModelBox(tentacle14, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles14 = new AdvancedModelRenderer(this);
        this.tentacles14.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle14.addChild(tentacles14);
        this.tentacles14.cubeList.add(new ModelBox(tentacles14, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle4 = new AdvancedModelRenderer(this);
        this.tentacle4.setRotationPoint(7.0F, 1.0F, 1.5F);
        this.head.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.1745F, 0.0F, -0.2182F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles4 = new AdvancedModelRenderer(this);
        this.tentacles4.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle4.addChild(tentacles4);
        this.tentacles4.cubeList.add(new ModelBox(tentacles4, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle15 = new AdvancedModelRenderer(this);
        this.tentacle15.setRotationPoint(1.0F, 1.0F, 0.5F);
        this.head.addChild(tentacle15);
        this.setRotateAngle(tentacle15, 0.0F, 0.0F, 0.2618F);
        this.tentacle15.cubeList.add(new ModelBox(tentacle15, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles15 = new AdvancedModelRenderer(this);
        this.tentacles15.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle15.addChild(tentacles15);
        this.tentacles15.cubeList.add(new ModelBox(tentacles15, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle3 = new AdvancedModelRenderer(this);
        this.tentacle3.setRotationPoint(7.0F, 1.0F, 0.5F);
        this.head.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, 0.0F, -0.2618F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles3 = new AdvancedModelRenderer(this);
        this.tentacles3.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle3.addChild(tentacles3);
        this.tentacles3.cubeList.add(new ModelBox(tentacles3, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle16 = new AdvancedModelRenderer(this);
        this.tentacle16.setRotationPoint(1.0F, 1.0F, -0.5F);
        this.head.addChild(tentacle16);
        this.setRotateAngle(tentacle16, -0.1745F, 0.0F, 0.2182F);
        this.tentacle16.cubeList.add(new ModelBox(tentacle16, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles16 = new AdvancedModelRenderer(this);
        this.tentacles16.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle16.addChild(tentacles16);
        this.tentacles16.cubeList.add(new ModelBox(tentacles16, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle2 = new AdvancedModelRenderer(this);
        this.tentacle2.setRotationPoint(7.0F, 1.0F, -0.5F);
        this.head.addChild(tentacle2);
        this.setRotateAngle(tentacle2, -0.1745F, 0.0F, -0.2182F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles2 = new AdvancedModelRenderer(this);
        this.tentacles2.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle2.addChild(tentacles2);
        this.tentacles2.cubeList.add(new ModelBox(tentacles2, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        this.tentacle17 = new AdvancedModelRenderer(this);
        this.tentacle17.setRotationPoint(2.0F, 1.0F, -2.5F);
        this.head.addChild(tentacle17);
        this.setRotateAngle(tentacle17, -0.2618F, 0.0F, 0.2182F);
        this.tentacle17.cubeList.add(new ModelBox(tentacle17, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, true));

        this.tentacles17 = new AdvancedModelRenderer(this);
        this.tentacles17.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle17.addChild(tentacles17);
        this.tentacles17.cubeList.add(new ModelBox(tentacles17, 4, 82, -0.49F, 0.25F, -0.49F, 1, 6, 1, 0.0F, true));

        this.tentacle = new AdvancedModelRenderer(this);
        this.tentacle.setRotationPoint(6.0F, 1.0F, -2.5F);
        this.head.addChild(tentacle);
        this.setRotateAngle(tentacle, -0.2618F, 0.0F, -0.2182F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 52, 73, -0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F, false));

        this.tentacles = new AdvancedModelRenderer(this);
        this.tentacles.setRotationPoint(0.0F, 7.75F, 0.0F);
        this.tentacle.addChild(tentacles);
        this.tentacles.cubeList.add(new ModelBox(tentacles, 4, 82, -0.51F, 0.25F, -0.49F, 1, 6, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.whole.render(f5 * 0.076F);
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
        this.whole.offsetY = 1.35F;
        this.whole.rotateAngleY = (float)Math.toRadians(180D);

        AdvancedModelRenderer[] tentacle1 = {this.tentacle, this.tentacles};
        AdvancedModelRenderer[] tentacle2 = {this.tentacle2, this.tentacles2};
        AdvancedModelRenderer[] tentacle3 = {this.tentacle3, this.tentacles3};
        AdvancedModelRenderer[] tentacle4 = {this.tentacle4, this.tentacles4};
        AdvancedModelRenderer[] tentacle5 = {this.tentacle5, this.tentacles5};
        AdvancedModelRenderer[] tentacle6 = {this.tentacle6, this.tentacles6};
        AdvancedModelRenderer[] tentacle7 = {this.tentacle7, this.tentacles7};
        AdvancedModelRenderer[] tentacle8 = {this.tentacle8, this.tentacles8};
        AdvancedModelRenderer[] tentacle9 = {this.tentacle9, this.tentacles9};
        AdvancedModelRenderer[] tentacle10 = {this.tentacle10, this.tentacles10};
        AdvancedModelRenderer[] tentacle11 = {this.tentacle11, this.tentacles11};
        AdvancedModelRenderer[] tentacle12 = {this.tentacle12, this.tentacles12};
        AdvancedModelRenderer[] tentacle13 = {this.tentacle13, this.tentacles13};
        AdvancedModelRenderer[] tentacle14 = {this.tentacle14, this.tentacles14};
        AdvancedModelRenderer[] tentacle15 = {this.tentacle15, this.tentacles15};
        AdvancedModelRenderer[] tentacle16 = {this.tentacle16, this.tentacles16};
        AdvancedModelRenderer[] tentacle17 = {this.tentacle17, this.tentacles17};

        float speed = 0.19F;
        float greaterFloat = 0.44F;
        float lesserFloat = 0.26F;

        //top set:
        this.chainWave(tentacle1, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle1, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle8, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle9, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle10, speed, greaterFloat, 1.5F, f2, 0.8F);

        this.chainWave(tentacle17, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle17, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //bottom set:
        this.chainWave(tentacle5, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle5, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle13, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle13, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //left set:
        this.chainFlap(tentacle2, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle2, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle3, speed, greaterFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle4, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainWave(tentacle4, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //right set:
        this.chainFlap(tentacle16, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainWave(tentacle16, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle15, speed, -greaterFloat, -1.5F, f2, 0.8F);

        this.chainFlap(tentacle14, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainWave(tentacle14, speed, -lesserFloat, 1.5F, f2, 0.8F);

        //centre four:
        this.chainWave(tentacle6, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle6, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle12, speed, greaterFloat, 1.5F, f2, 0.8F);
        this.chainFlap(tentacle12, speed, -lesserFloat, 1.5F, f2, 0.8F);

        this.chainWave(tentacle7, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle7, speed, lesserFloat, -1.5F, f2, 0.8F);

        this.chainWave(tentacle11, speed, -greaterFloat, -1.5F, f2, 0.8F);
        this.chainFlap(tentacle11, speed, -lesserFloat, 1.5F, f2, 0.8F);


        if (e.isInWater()) {
            this.bob(whole, 0.22F, 0.90F, false, f2, 2);
            this.walk(whole, 0.2F, 0.15F, false, 0,0.15F,1.5F,1.0F);
        }
        else {
            this.whole.rotateAngleZ = (float) Math.toRadians(90);
            this.whole.offsetY = 1.45F;
        }
    }
}
